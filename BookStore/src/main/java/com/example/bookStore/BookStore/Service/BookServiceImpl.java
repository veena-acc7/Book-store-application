package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Exception.UserException;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Repository.BookRepository;
import com.example.bookStore.BookStore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import javax.transaction.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Books addBook(Books book){
        return bookRepository.save(book);
    }
    
    @Override
    public Books updateBook(Books book){
        Optional<Books> bookObj = this.bookRepository.findById((long) book.getBookId());

        if(bookObj.isPresent()) {
            Books bookUpdate = bookObj.get();
            bookUpdate.setBookId((int) book.getBookId());
            bookUpdate.setBookName(book.getBookName());
            bookUpdate.setBookAuthor(book.getBookAuthor());
            bookUpdate.setBookCategory(book.getBookCategory());
            bookUpdate.setBookCopies(book.getBookCopies());
            bookUpdate.setBookPrice(book.getBookPrice());
            bookUpdate.setBookCode(book.getBookCode());
           

            return this.bookRepository.save(bookUpdate);
        }else{
            throw new UserException("User not found with ID: " + book.getBookId());
        }
    }

}
