package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.BookRent;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;

public interface BookRentService {

	
	public BookRent rentBook(BookRent bookRent, long user_id, long bookId,User user,Books book);

	public BookRent returnBook(BookRent bookRent, long user_id, long bookId, User user, Books book);

}
