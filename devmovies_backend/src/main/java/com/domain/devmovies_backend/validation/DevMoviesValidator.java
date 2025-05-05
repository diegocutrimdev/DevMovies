package com.domain.devmovies_backend.validation;

import com.domain.devmovies_backend.exception.InvalidParameterException;

import java.time.Year;

public class DevMoviesValidator {

    public static void validarAno(Integer ano) {
        if (ano != null && (ano < 1900 || ano > Year.now().getValue())) {
            throw new InvalidParameterException("Ano de lançamento inválido: " + ano);
        }
    }

    public static void validarIdioma(String idioma) {
        if (idioma != null && !idioma.matches("^[a-z]{2}$")) {
            throw new InvalidParameterException("Código de idioma inválido: " + idioma + ". Esperado: 2 letras minúsculas.");
        }
    }

    public static void validarPais(String pais) {
        if (pais != null && !pais.matches("^[A-Z]{2}$")) {
            throw new InvalidParameterException("Código de país inválido: " + pais + ". Esperado: 2 letras maiúsculas.");
        }
    }
}
