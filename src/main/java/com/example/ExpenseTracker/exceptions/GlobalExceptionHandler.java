package com.example.ExpenseTracker.exceptions;

import com.example.ExpenseTracker.entity.ErrorObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

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
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorObject> handleMethodArgumentMismatchException(MethodArgumentTypeMismatchException ex, WebRequest request){

       ErrorObject eObject = new ErrorObject();

        eObject.setStatusCode(HttpStatus.BAD_REQUEST.value());

        eObject.setMessage(ex.getMessage());

        eObject.setTimestamp ( System.currentTimeMillis());

       return new ResponseEntity<ErrorObject>(eObject,HttpStatus.BAD_REQUEST);

    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorObject> handleGeneralException(Exception ex, WebRequest request){

       ErrorObject eObject = new ErrorObject();

        eObject.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());

        eObject.setMessage(ex.getMessage());

        eObject.setTimestamp ( System.currentTimeMillis());

       return new ResponseEntity<ErrorObject>(eObject,HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
