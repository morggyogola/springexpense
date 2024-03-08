package com.example.ExpenseTracker.service;

import com.example.ExpenseTracker.entity.User;
import com.example.ExpenseTracker.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(UserModel user);

    User readUser(Long id);
    User update(User user, Long id);
}
