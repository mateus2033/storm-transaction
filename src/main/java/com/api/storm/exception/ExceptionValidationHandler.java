package com.api.storm.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.LinkedHashMap;
import java.util.List;

@Slf4j(topic = "EXCEPTION_VALIDATION_HANDLER")
@ControllerAdvice
public class ExceptionValidationHandler extends ResponseEntityExceptionHandler {

    @Override
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        String message = "";
        String field = "";

        LinkedHashMap<String, Object> response = new LinkedHashMap<>();
        for (FieldError newError : ex.getFieldErrors()) {
            message = newError.getDefaultMessage();
            field = newError.getField();
            response.put(field, message);
        }

        return super.handleExceptionInternal(ex, response, headers, status, request);
    }


}
