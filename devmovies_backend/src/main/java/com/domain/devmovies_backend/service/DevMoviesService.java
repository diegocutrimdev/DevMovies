package com.domain.devmovies_backend.service;

import com.domain.devmovies_backend.dto.DevMoviesResponse;
import com.domain.devmovies_backend.enums.ExternalApplicationGenre;

public interface DevMoviesService {
    DevMoviesResponse getMovie(
            Integer ano,
            String pais,
            String idioma,
            ExternalApplicationGenre genero
    );
}
