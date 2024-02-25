package com.example.ExpenseTracker.service;

import com.example.ExpenseTracker.entity.Expense;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ExpenseService {
    List<Expense> getAllExpenses();
    Expense getExpenseById(Long id);

    void deleteExpenseById(Long id);

    Expense saveExpenseDetails(Expense expense);

    Expense updateExpenseDetails(Expense expense,Long id);
}
