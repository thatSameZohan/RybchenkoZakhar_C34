package org.spring.controller;

import org.spring.exc.TestException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(TestException.class)
    public String testExceptionHandler(TestException e){
        System.out.println(e.getMessage());
        return "testExc";
    }
    }
