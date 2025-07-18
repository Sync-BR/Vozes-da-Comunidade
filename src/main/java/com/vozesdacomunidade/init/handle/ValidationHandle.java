package com.vozesdacomunidade.init.handle;

import com.vozesdacomunidade.init.handle.exception.ResourceAlreadyExistsException;
import com.vozesdacomunidade.init.model.dto.HandleDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ValidationHandle {

    @ExceptionHandler(ResourceAlreadyExistsException.class)
    public ResponseEntity<HandleDto> handleResourceAlreadyExists(ResourceAlreadyExistsException ex, HttpServletRequest request) {
        HandleDto response = new HandleDto(
                HttpStatus.CONFLICT.value(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }


}
