package com.example.ExpenseTracker.repository;

import com.example.ExpenseTracker.entity.Expense;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    //SELECT * FROM TBL_EXPENSES WHERE CATEGORY=?
    Page<Expense> findByCategory(String category, Pageable page);

    //SELECT * FROM TBL_EXPENSES WHERE NAME LIKE '%keyword%'
    Page<Expense> findByNameContaining(String keyword, Pageable page);
//SELECT * FROM TBL_EXPENSES WHERE DATE BETWEEN STARTDATE AND ENDDATE
    Page<Expense> findByDateBetween(Date startDate, Date endDate, Pageable page);

}
