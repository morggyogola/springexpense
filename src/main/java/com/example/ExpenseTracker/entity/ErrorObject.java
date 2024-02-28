package com.example.ExpenseTracker.entity;

import lombok.Data;

@Data
public class ErrorObject {
    private Integer statusCode;
    private String message;
    private Data timestamp;

    public void setTimestamp(long l) {
    }
}
