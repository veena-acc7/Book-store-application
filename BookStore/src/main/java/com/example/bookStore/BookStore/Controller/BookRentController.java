//package com.example.bookStore.BookStore.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.bookStore.BookStore.Module.BookRent;
//import com.example.bookStore.BookStore.Module.Books;
//import com.example.bookStore.BookStore.Service.BookRentService;
//
//@RestController
//public class BookRentController {
//	@Autowired
//	private BookRentService bookRentService;
//	@PostMapping("/rentBook")
//	private ResponseEntity<BookRent> rentBook(@RequestBody BookRent bookRent){
//        return ResponseEntity.ok().body(this.bookRentService.rentBook(bookRent));
//    }
//
//	
//}
