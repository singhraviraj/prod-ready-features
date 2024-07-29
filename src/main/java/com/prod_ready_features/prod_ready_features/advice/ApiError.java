package com.prod_ready_features.prod_ready_features.advice;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiError {

    private LocalDateTime timeStamp;
    private String error;
    private HttpStatus status;

    public ApiError() {
    }

    public ApiError(String error, HttpStatus status) {
        this.timeStamp = LocalDateTime.now();
        this.error = error;
        this.status = status;
    }
}
