package com.example.ExpenseTracker.controller;

import com.example.ExpenseTracker.entity.User;
import com.example.ExpenseTracker.model.UserModel;
import com.example.ExpenseTracker.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    ResponseEntity<User> save(@Valid @RequestBody UserModel user){
        return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<User> readUser(@PathVariable Long id){
        return  new ResponseEntity<User>(userService.readUser(id),HttpStatus.OK);
    }
    @PutMapping("/users/{id}")
    public  ResponseEntity<User> update(@RequestBody User user, @PathVariable Long id){
        User mUser = userService.update(user,id);
        return  new ResponseEntity<User>(mUser,HttpStatus.OK);
    }
}
