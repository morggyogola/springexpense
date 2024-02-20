package com.example.ExpenseTracker.service;

import com.example.ExpenseTracker.entity.Expense;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ExpenseService {
    List<Expense> getAllExpenses();
}
