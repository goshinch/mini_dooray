package com.nhnacademy.TaskAPI.exception;

public class CreationFailedException extends RuntimeException {
    public CreationFailedException(String message) {
        super(message);
    }
}
