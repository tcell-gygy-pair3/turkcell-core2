package com.turkcell.authserver.core.utils.exceptions.types;

public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
