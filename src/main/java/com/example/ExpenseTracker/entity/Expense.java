package com.example.ExpenseTracker.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@Table(name = "tbl_expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "expense_name")
    private String name;
    @Column(name = "expense_description")
    private String description;
    @ Column(name = "expense_amount")
    private BigDecimal amount;
    @Column(name = "expense_category")
    private String category;
    @Column(name = "expense_date")
    private Date date;
    @Column(name = "created_at",nullable = false,updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;
    @Column(name = "updated_at",nullable = false,updatable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;

}
