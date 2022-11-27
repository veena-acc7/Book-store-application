package com.book.store.controller;

import com.book.store.model.Book;
import com.book.store.repository.BookRepository;
import com.book.store.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok().body(this.bookService.getBooks());
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
    		 return ResponseEntity.ok().body(this.bookService.createBooks(book));
    }
}