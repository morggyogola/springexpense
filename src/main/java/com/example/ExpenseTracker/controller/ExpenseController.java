package com.example.ExpenseTracker.controller;

import com.example.ExpenseTracker.entity.Expense;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {
    @GetMapping("/expenses")
    public Expense getAllExpenses(){

        return null;
    }
}
