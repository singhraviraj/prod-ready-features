package com.prod_ready_features.prod_ready_features.advice;

import com.prod_ready_features.prod_ready_features.Exceptions.NoResourceFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {



    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<ApiError> NoResourceFoundExceptionHandler(NoResourceFoundException exception){
        ApiError apiError = new ApiError(exception.getLocalizedMessage(),HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

}
