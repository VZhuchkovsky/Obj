package com.hillel.com.hillel.exception;

/**
 * Created by VZhuchkovsky on 28.05.2015.
 */
public class GradeAlreadyExistException extends RuntimeException {
    public GradeAlreadyExistException(String message) {
        super(message);
    }
}
