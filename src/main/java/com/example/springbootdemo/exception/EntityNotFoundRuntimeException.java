package com.example.springbootdemo.exception;

public class EntityNotFoundRuntimeException extends RuntimeException {

    public EntityNotFoundRuntimeException(String message) {
        super(message);
    }
}