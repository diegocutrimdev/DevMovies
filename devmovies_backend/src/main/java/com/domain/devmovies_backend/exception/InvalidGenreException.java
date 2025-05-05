package com.domain.devmovies_backend.exception;

public class InvalidGenreException extends RuntimeException {

    public InvalidGenreException(String message) {
        super(message);
    }
}
