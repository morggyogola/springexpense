package com.example.ExpenseTracker.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "Entity name must  not be null")
    @Size(min = 3,message = "Expense name must be atleast 3 characters")
    private String name;

    @Column(name = "expense_description")
    @NotBlank(message = "Description cannot be blank")
    private String description;

    @ Column(name = "expense_amount")
    @NotNull(message = "Amount cannot  be null")
    private BigDecimal amount;

    @Column(name = "expense_category")
    @NotBlank(message = "Category cannot be blank")
    private String category;

    @Column(name = "date")
    private Date date;

    @Column(name = "created_at",nullable = false,updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;
    @Column(name = "updated_at",nullable = false,updatable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;

}
