package com.example.bookStore.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookStore.BookStore.Module.BookRent;
@Repository
public interface BookRentRepository extends JpaRepository<BookRent,Long> {

}
