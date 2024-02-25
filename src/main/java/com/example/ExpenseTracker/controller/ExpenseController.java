package com.example.ExpenseTracker.controller;

import com.example.ExpenseTracker.entity.Expense;
import com.example.ExpenseTracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;
    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses() ;
    }
    @GetMapping("/expenses/{id}")
    public Expense getExpenseById(@PathVariable Long id){
        return expenseService.getExpenseById(id);
    }
    @DeleteMapping("/expenses")
    public void deleteExpenseById(@RequestParam("id")Long id){
        expenseService.deleteExpenseById(id);
    }
}
