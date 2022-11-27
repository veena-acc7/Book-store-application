package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.User;


public interface UserService {

    User createUser(User user);
    User updateUser(User user);
    User suspendUser(User user);
//    User addMoney();
	User addMoney( User user, int money);
}
