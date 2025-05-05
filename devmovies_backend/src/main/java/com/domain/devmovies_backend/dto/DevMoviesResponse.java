package com.domain.devmovies_backend.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DevMoviesResponse {
    private String filme;
    private String sinopse;
    private String dataLancamento;
}
