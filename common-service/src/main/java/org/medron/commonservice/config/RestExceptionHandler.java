package org.medron.commonservice.config;

import org.medron.commonservice.constant.ExceptionType;
import org.medron.commonservice.exception.BusinessException;
import org.medron.commonservice.exception.ExceptionResult;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionResult<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e){
        Map<String,String> errors = new HashMap<>();
        for(FieldError fieldError :e.getBindingResult().getFieldErrors()){
            errors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        return new ExceptionResult<>(errors, ExceptionType.Validation);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ExceptionResult<Object> handleBusinessException(BusinessException e){
        return new ExceptionResult<>(e,ExceptionType.Business);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionResult<Object> handleRuntimeException(RuntimeException e){
        return new ExceptionResult<>(e,ExceptionType.Runtime);
    }
    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    public ExceptionResult<Object> handleDataIntegrityViolation(DataIntegrityViolationException e){
        return new ExceptionResult<>(e,ExceptionType.DataIntegrityViolation);
    }

}
