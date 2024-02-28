package com.example.ExpenseTracker.exceptions;

import com.example.ExpenseTracker.entity.ErrorObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorObject> handleExpenseNotFoundException(ResourceNotFoundException ex, WebRequest request){

       ErrorObject eObject = new ErrorObject();

        eObject.setStatusCode(HttpStatus.NOT_FOUND.value());

        eObject.setMessage(ex.getMessage());

        eObject.setTimestamp ( System.currentTimeMillis());

       return new ResponseEntity<ErrorObject>(eObject,HttpStatus.NOT_FOUND);

    }
}
