package com.domain.devmovies_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.domain.devmovies_backend.dto.DevMoviesResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.RequestParam;
import com.domain.devmovies_backend.service.DevMoviesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.domain.devmovies_backend.enums.ExternalApplicationGenre;

@Tag(name = "DevMovies")
@RequiredArgsConstructor

@RestController
@RequestMapping(value = "/api/devmovies")
public class DevMoviesController {
    private final DevMoviesService devMoviesService;

    @GetMapping(value = "/random")
    @Operation(summary = "Retorna um filme aleatório com base nos filtros fornecidos")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Filme encontrado"),
            @ApiResponse(responseCode = "400", description = "Parâmetro inválido"),
            @ApiResponse(responseCode = "400", description = "Nenhum filme encontrado com os filtros fornecidos")
    })
    public ResponseEntity<DevMoviesResponse> getRandomMovie(
            @Parameter(description = "Ano de lançamento (ex: 2020)")
            @RequestParam(required = false) Integer ano,

            @Parameter(description = "País de origem (ex: ex: US, BR)")
            @RequestParam(required = false) String pais,

            @Parameter(description = "Idioma original do filme (ex: en, pt)")
            @RequestParam(required = false) String idioma,

            @Parameter(description = "Gênero do filme")
            @RequestParam(required = false) ExternalApplicationGenre genero) {

        var movie = devMoviesService.getMovie(ano, pais, idioma, genero);
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }
}
