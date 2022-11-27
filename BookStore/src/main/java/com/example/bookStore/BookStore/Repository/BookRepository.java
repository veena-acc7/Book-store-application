package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,Long> {
}
