package com.example.bookStore.BookStore.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookStore.BookStore.Module.BookReview;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Repository.BookRepository;
import com.example.bookStore.BookStore.Repository.BookReviewRepository;
@Service
@Transactional
public class BookReviewServiceImpl implements BookReviewService {
	 	@Autowired
	    private BookReviewRepository bookReviewRepository;

	    @Override
	    public BookReview addReview(BookReview bookReview){
	        return bookReviewRepository.save(bookReview);
	    }
}
