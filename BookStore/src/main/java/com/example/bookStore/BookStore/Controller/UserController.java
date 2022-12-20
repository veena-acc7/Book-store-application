package com.example.bookStore.BookStore.Controller;

import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user")
    private ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok().body(this.userService.createUser(user));
    }
    
    @GetMapping("/getUsers")
    private ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(this.userService.getUsers());
    }

    @PutMapping("/user/{user_id}")
    private ResponseEntity<User> updateUser(@PathVariable int user_id, @RequestBody User user){
        user.setUser_id((user_id));
        return ResponseEntity.ok().body(this.userService.updateUser(user));
    }

    @PutMapping("/suspended_user/{user_id}")
    private ResponseEntity<User> suspendUser(@PathVariable long user_id, @RequestBody User user){
        user.setUser_id((user_id));
        return ResponseEntity.ok().body(this.userService.suspendUser(user));
    }
    
    @PutMapping("/addMoney/{user_id}/{money}")
    private ResponseEntity<User> addMoney(@PathVariable int user_id,@RequestBody User user,@PathVariable int money){
    	user.setUser_id(user_id);
    	return ResponseEntity.ok().body(this.userService.addMoney(user,money));
    }
    
}
