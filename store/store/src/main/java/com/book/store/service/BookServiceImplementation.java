package com.book.store.service;

import com.book.store.model.Book;
import com.book.store.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookServiceImplementation implements BookService{
   @Autowired
    private BookRepository bookRepository;

    @Override
    public Book createBooks(Book book){
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return (List<Book>) this.bookRepository.findAll();
    }
}
