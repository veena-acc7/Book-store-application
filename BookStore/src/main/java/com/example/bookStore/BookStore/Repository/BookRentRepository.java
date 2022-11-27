package com.example.bookStore.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookStore.BookStore.Module.BookRent;

public interface BookRentRepository extends JpaRepository<BookRent,Long> {

}
