package org.medron.commonservice.exception;

public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}
