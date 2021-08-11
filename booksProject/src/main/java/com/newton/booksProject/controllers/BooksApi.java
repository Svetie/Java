package com.newton.booksProject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newton.booksProject.models.Book;
import com.newton.booksProject.services.BookService;

@RestController
public class BooksApi {
    private final BookService bookService;
    
    // constructor
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    @PostMapping("/api/books")
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String description, @RequestParam(value="language") String language, @RequestParam(value="pages") Integer pages) {
        Book book = new Book(title, description, language, pages);
        System.out.println("new book is " + book.getTitle());
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    @RequestMapping("/api/books/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	this.bookService.deleteBook(id);
    }
    
    @PutMapping("/api/books/update/{id}")
	public Book updateBook(@PathVariable("id")Long id, 
			@RequestParam(value="title") String title, 
			@RequestParam(value="description") String description, 
			@RequestParam("pages") Integer pages) {
	
		return this.bookService.updateBook(id, title, description, pages);
		
	}
}