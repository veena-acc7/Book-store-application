package com.example.bookStore.BookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Service.BookService;


@RestController
public class BookController {
	 @Autowired
	 private BookService bookService;
	 
	 @PostMapping("/addBook")
	    private ResponseEntity<Books> saveBook(@RequestBody Books book){
	        return ResponseEntity.ok().body(this.bookService.addBook(book));
	    }

//	    @PutMapping("/user/{user_id}")
//	    private ResponseEntity<User> updateUser(@PathVariable int user_id, @RequestBody User user){
//	        user.setUser_id((user_id));
//	        return ResponseEntity.ok().body(this.userService.updateUser(user));
//	    }

}

