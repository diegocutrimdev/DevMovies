package com.domain.devmovies_backend.dto;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalApplicationDto {
    @JsonProperty("results")
    private List<ExternalApplicationAttributesDto> list;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ExternalApplicationAttributesDto {

        @JsonProperty("original_title")
        private String movie;
        @JsonProperty("overview")
        private String plot;
        @JsonProperty("release_date")
        private String releaseDate;
    }
}
