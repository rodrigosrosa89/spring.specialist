package com.rodrigo.spring.specialist.java.web.common.handlers;

import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ModelAndView handleNoSuchElementException(NoSuchElementException e) {
        var model = Map.of(
            "message", e.getMessage(),
            "status", 404
        );
        return new ModelAndView("error/error", model);
    }
    
}
