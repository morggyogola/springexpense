package com.example.ExpenseTracker.service;

import com.example.ExpenseTracker.entity.User;
import com.example.ExpenseTracker.model.UserModel;
import com.example.ExpenseTracker.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepo;
    @Override
    public User createUser(UserModel uModel) {
        User user = new User();
        BeanUtils.copyProperties(uModel, user);
        return userRepo.save(user);
    }
}
