package com.turkcell.authserver.core.utils.exceptions.types;

public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}