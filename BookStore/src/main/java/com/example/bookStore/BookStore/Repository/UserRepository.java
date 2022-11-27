package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}

