package com.example.springbootdemo.exception;


public class BadRequestRuntimeException extends RuntimeException {

    public BadRequestRuntimeException(String message) {
        super(message);
    }
}