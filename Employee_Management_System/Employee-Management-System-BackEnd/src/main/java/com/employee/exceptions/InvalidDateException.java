package com.employee.exceptions;

public class InvalidDateException extends RuntimeException {

    public InvalidDateException(String msg) {
        super(msg);
    }
}
