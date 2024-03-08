package com.example.ExpenseTracker.service;

import com.example.ExpenseTracker.entity.User;
import com.example.ExpenseTracker.exceptions.ItemAlreadyExistsException;
import com.example.ExpenseTracker.exceptions.ResourceNotFoundException;
import com.example.ExpenseTracker.model.UserModel;
import com.example.ExpenseTracker.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepo;
    @Override
    public User createUser(UserModel user) {
        if (userRepo.existsByEmail(user.getEmail())){
            throw new ItemAlreadyExistsException("User is already registered with email"+user.getEmail());
        }
        User newUser = new User();
        BeanUtils.copyProperties(user, newUser);
        return userRepo.save(newUser);
    }

    @Override
    public User readUser(Long id) {
        return userRepo.findById( id).orElseThrow(()->new ResourceNotFoundException("User not found for the id:"+id));
    }

    @Override
    public User update(User user, Long id) {
        User oUser= readUser(id);
        oUser.setEmail(user.getEmail() !=null? user.getEmail() : oUser.getEmail());
        oUser.setAge(user.getAge() !=null? user.getAge() : oUser.getAge());
        oUser.setPassword(user.getPassword() !=null? user.getPassword() : oUser.getPassword());
        return userRepo.save(oUser);
    }
}
