package com.domain.devmovies_backend.exception.controller;

import org.springframework.http.HttpStatus;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.domain.devmovies_backend.exception.MovieNotFoundException;
import com.domain.devmovies_backend.exception.InvalidParameterException;
import com.domain.devmovies_backend.exception.dto.DevMoviesErrorResponse;

import java.time.Instant;

@ControllerAdvice
public class DevMoviesHandlerController {

    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<DevMoviesErrorResponse> movieNotFound(MovieNotFoundException exception, HttpServletRequest request) {
        var devMoviesErrorResponse = new DevMoviesErrorResponse(
                Instant.now(),
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(devMoviesErrorResponse);
    }


    @ExceptionHandler(InvalidParameterException.class)
    public ResponseEntity<DevMoviesErrorResponse> invalidParameterException(InvalidParameterException exception, HttpServletRequest request) {
        var devMoviesErrorResponse = new DevMoviesErrorResponse(
                Instant.now(),
                HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(devMoviesErrorResponse);
    }
}
