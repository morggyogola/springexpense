package com.example.ExpenseTracker.exceptions;

    public class ItemAlreadyExistsException extends RuntimeException{
    public  ItemAlreadyExistsException(String message){
        super(message);
    }
}
