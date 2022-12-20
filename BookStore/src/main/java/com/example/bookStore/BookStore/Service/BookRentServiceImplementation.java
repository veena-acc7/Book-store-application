package com.example.bookStore.BookStore.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookStore.BookStore.Exception.UserException;
import com.example.bookStore.BookStore.Module.BookRent;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Repository.BookRentRepository;
import com.example.bookStore.BookStore.Repository.BookRepository;
import com.example.bookStore.BookStore.Repository.UserRepository;

@Service
@Transactional
public class BookRentServiceImplementation implements BookRentService {
	@Autowired
	private BookRentRepository bookRentRepo;
	@Autowired
	private BookRepository bookRepo;
	@Autowired 
	private UserRepository userRepo;
	@Override
	public BookRent rentBook(BookRent bookRent, long user_id, long bookId,User user,Books book){
        Optional<Books> bookObj = this.bookRepo.findById((long) book.getBookId());
        Optional<User> userObj=this.userRepo.findById(user.getUser_id());

	        if(bookObj.isPresent() && userObj.isPresent()) {
	        	BookRent bookRentUpdate=new BookRent();
	        	User userUpdate = userObj.get();
	        	Books bookDetail=bookObj.get();
	        	
	        	int userWallet=userUpdate.getWallet();
	        	double deposit=bookDetail.getBookPrice()*0.2;
	        	
	        	if (userWallet>=deposit && userUpdate.getBooksBorrowed()<3) {
	        		bookRentUpdate.setBookId(bookId);
		        	bookRentUpdate.setUser_id(user_id);
	        		bookRentUpdate.setDepositAmt(deposit);
	        		bookRentUpdate.setStatus("issued");
	        		bookDetail.setBookCopies(bookDetail.getBookCopies()-1);
		        	userUpdate.setWallet((int) (userWallet - deposit));
		        	userUpdate.setBooksBorrowed(userUpdate.getBooksBorrowed()+1);
	        	}
	        	else {
	        		throw new UserException("Please update your wallet balance to " +deposit );
	        	}
	        	
	        	return this.bookRentRepo.save(bookRentUpdate);
	        }
	           
	        else {
	        	throw new UserException("User not found with ID: " + book.getBookId());
	        }
	}
	
	@Override
	public BookRent returnBook(BookRent bookRent, long user_id, long bookId,User user,Books book){
        Optional<Books> bookObj = this.bookRepo.findById((long) book.getBookId());
        Optional<User> userObj=this.userRepo.findById(user.getUser_id());
        Optional<BookRent> bookRentObj=this.bookRentRepo.findById(book.getBookId());
        if (bookRentObj.isPresent()) {
        	BookRent bookRentUpdate=bookRentObj.get();
        	User userUpdate = userObj.get();
        	Books bookDetail=bookObj.get();
        	int userWallet=userUpdate.getWallet();
        	double deposit=bookDetail.getBookPrice()*0.1;
        	bookRentUpdate.setDepositAmt(deposit);
        	bookRentUpdate.setStatus("returned");
        	userUpdate.setWallet((int) (userWallet+deposit));
        	bookDetail.setBookCopies(bookDetail.getBookCopies()+1); 
        	return this.bookRentRepo.save(bookRentUpdate);
        }
        else {
        	throw new UserException("user didnt borrow the given book ");
        }

	}
}
