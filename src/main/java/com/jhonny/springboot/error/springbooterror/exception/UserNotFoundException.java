package com.jhonny.springboot.error.springbooterror.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    } 
}
