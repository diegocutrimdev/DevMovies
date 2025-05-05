package com.domain.devmovies_backend.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.domain.devmovies_backend.dto.DevMoviesResponse;
import org.springframework.core.ParameterizedTypeReference;
import com.domain.devmovies_backend.service.DevMoviesService;
import com.domain.devmovies_backend.dto.ExternalApplicationDto;
import com.domain.devmovies_backend.enums.ExternalApplicationGenre;

import java.util.*;

@Service
@RequiredArgsConstructor
public class DevMoviesServiceImpl implements DevMoviesService {

    private final RestTemplate restTemplate;

    @Override
    public DevMoviesResponse getMovie(Integer ano, String pais, String idioma, ExternalApplicationGenre genero) {

        StringBuilder url = new StringBuilder("https://api.themoviedb.org/3/discover/movie");
        String apiKey = "a34a59d5d9354d22c9cb7300e4cc9bc4";
        url.append("?api_key=").append(apiKey);
        url.append("&language=pt-BR");

        if (ano != null) url.append("&primary_release_year=").append(ano);
        if (pais != null) url.append("&with_origin_country=").append(pais);
        if (idioma != null) url.append("&with_original_language=").append(idioma);
        if (genero != null) url.append("&with_genres=").append(Objects.requireNonNull(genero).getId());

        ResponseEntity<ExternalApplicationDto> response = restTemplate.exchange(
                url.toString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });

        List<ExternalApplicationDto.ExternalApplicationAttributesDto> movies = Optional.ofNullable(response.getBody())
                .map(ExternalApplicationDto::getList).orElse(Collections.emptyList());

        if (movies.isEmpty()) throw new RuntimeException("Nenhum filme encontrado com os filtros fornecidos.");
        var randomMovie = movies.get(new Random().nextInt(movies.size()));

        return new DevMoviesResponse(randomMovie.getMovie(), randomMovie.getPlot(), randomMovie.getReleaseDate());
    }
}
