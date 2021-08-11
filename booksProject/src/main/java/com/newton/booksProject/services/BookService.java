package com.newton.booksProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.newton.booksProject.models.Book;
import com.newton.booksProject.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return this.bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // delete a book
    public void deleteBook(Long id) {
    	this.bookRepository.deleteById(id);
    }
    
    // update a book
    public Book updateBook(Long id, String title, String description, Integer pages) {
		//retrieve a pet object from the db that has that id
		Book book = this.findBook(id);
//		System.out.println("***********");
//		System.out.println(book.getTitle());
//		System.out.println("***********");
	
		//update that object
		book.setTitle(title);
		book.setDescription(description);
		book.setNumberOfPages(pages);
		
		return this.bookRepository.save(book);
    }
}