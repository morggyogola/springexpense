package com.example.ExpenseTracker.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 6792258727996177910L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
