package com.domain.devmovies_backend.service.impl;

import org.springframework.stereotype.Service;
import com.domain.devmovies_backend.dto.DevMoviesResponse;
import com.domain.devmovies_backend.service.DevMoviesService;
import com.domain.devmovies_backend.enums.ExternalApplicationGenre;

@Service
public class DevMoviesServiceImpl implements DevMoviesService {
    @Override
    public DevMoviesResponse getMovie(Integer ano, String pais, String idioma, ExternalApplicationGenre genero) {
        return null;
    }
}
