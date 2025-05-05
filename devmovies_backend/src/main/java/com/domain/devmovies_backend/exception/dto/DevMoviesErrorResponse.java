package com.domain.devmovies_backend.exception.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
public class DevMoviesErrorResponse {
    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;
}