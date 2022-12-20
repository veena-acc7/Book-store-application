package com.example.bookStore.BookStore.Service;

import java.util.List;

import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;

public interface BookService {
    Books addBook(Books book);

	Books updateBook(Books book);

	List<Books> getBooks();
}
