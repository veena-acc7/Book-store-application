package com.example.bookStore.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookStore.BookStore.Module.BookReview;

public interface BookReviewRepository extends JpaRepository<BookReview,Long>{

}
