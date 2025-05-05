package com.domain.devmovies_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.domain.devmovies_backend.dto.DevMoviesResponse;
import org.springframework.web.bind.annotation.RequestParam;
import com.domain.devmovies_backend.service.DevMoviesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.domain.devmovies_backend.enums.ExternalApplicationGenre;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/devmovies")
public class DevMoviesController {
    private final DevMoviesService devMoviesService;

    @GetMapping(value = "/random")
    public ResponseEntity<DevMoviesResponse> getRandomMovie(
            @RequestParam(required = false) Integer ano,
            @RequestParam(required = false) String pais,
            @RequestParam(required = false) String idioma,
            @RequestParam(required = false) ExternalApplicationGenre genero) {
        var movie = devMoviesService.getMovie(ano, pais, idioma, genero);
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }
}
