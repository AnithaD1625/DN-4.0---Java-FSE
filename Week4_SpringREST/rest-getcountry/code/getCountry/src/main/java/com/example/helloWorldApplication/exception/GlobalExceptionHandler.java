package com.example.helloWorldApplication.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CountryNotFoundException.class)
    public ResponseEntity<String> handleNotFound(CountryNotFoundException ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }
}
