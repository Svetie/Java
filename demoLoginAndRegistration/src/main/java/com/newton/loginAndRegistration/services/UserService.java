package com.newton.loginAndRegistration.services;

import java.util.Optional;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.newton.loginAndRegistration.models.LoginUser;
import com.newton.loginAndRegistration.models.User;
import com.newton.loginAndRegistration.repositories.UserRepository;
    
    
@Service
public class UserService {
    
	// automatically generates a constructor and initializes the variable
    @Autowired
    private UserRepository userRepo;
    
    /**
     * service method to register a user
     * @param newUser // accepts a user
     * @param result // accept the validation from the form
     * @return save a user to the database
     */
    public User register(User newUser, BindingResult result) {
    	// validate the email to be unique
        if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "This email is already in use!");
        }
        
        // confirm password and confirm match
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
        	// if there are no errors, encrypt the password
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            
            // set the user's password
            newUser.setPassword(hashed);
            
            // save the user object and return it
            return userRepo.save(newUser);
        }
    }
    
    public User findUserById(Long id) {
    	return this.userRepo.findById(id).orElse(null);
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
        if(result.hasErrors()) {
            return null;
        }
        
        // if email doesn't exist, create a validation error - unknown email
        Optional<User> potentialUser = this.userRepo.findByEmail(newLogin.getEmail());
        if(!potentialUser.isPresent()) {
            result.rejectValue("email", "Unique", "Unknown email!");
            return null;
        }
        User user = potentialUser.get();
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            return user;
        }
    }
    
}
