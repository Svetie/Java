package com.newton.loginAndRegistration.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newton.loginAndRegistration.models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	// JPA method
	// returns user or null if not found
	Optional<User> findByEmail(String email);
	
	List<User> findAll();

}