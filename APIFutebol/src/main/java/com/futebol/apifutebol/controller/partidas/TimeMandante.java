package com.futebol.apifutebol.controller.partidas;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TimeMandante(
        @JsonProperty("time_id") String timeId,
        @JsonProperty("nome_popular") String nomePopular,
        String sigla
) {
}
