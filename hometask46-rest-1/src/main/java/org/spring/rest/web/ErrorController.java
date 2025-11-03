package org.spring.rest.web;

import org.spring.rest.dto.ErrorDto;
import org.spring.rest.exc.ProfileNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(ProfileNotFoundException.class)
    public ResponseEntity<ErrorDto> handleProfileNotFoundException() {
        return ResponseEntity.status(404).body(new ErrorDto("Profile not found"));
    }
}
