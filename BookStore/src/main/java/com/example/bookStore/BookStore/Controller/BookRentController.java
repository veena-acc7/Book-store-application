package com.example.bookStore.BookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookStore.BookStore.Module.BookRent;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Service.BookRentService;

@RestController
public class BookRentController {
	@Autowired
	private BookRentService bookRentService;
	@PutMapping("/rentBook/{user_id}/{bookId}")
	public ResponseEntity<BookRent> rentBook(@RequestBody BookRent bookRent,@PathVariable long user_id,@PathVariable long bookId,User user,Books book){
		user.setUser_id(user_id);
		book.setBookId(bookId);
        return ResponseEntity.ok().body(this.bookRentService.rentBook(bookRent, user_id, bookId, user, book));
    }
	@PutMapping("/returnBook/{user_id}/{bookId}")
	public ResponseEntity<BookRent> returnBook(@RequestBody BookRent bookRent ,@PathVariable long user_id,@PathVariable long bookId,User user, Books book){
		user.setUser_id(user_id);
		book.setBookId(bookId);
		return ResponseEntity.ok().body(this.bookRentService.returnBook(bookRent,user_id,bookId,user,book));
		
	}
	
}