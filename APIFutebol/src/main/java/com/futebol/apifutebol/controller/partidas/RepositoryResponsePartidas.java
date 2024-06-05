package com.futebol.apifutebol.controller.partidas;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponsePartidas(
        @JsonProperty("time_id") TimeMandante timeId,
        @JsonProperty("nome_popular") TimeMandante nomePopular,
        @JsonProperty("sigla") TimeMandante sigla
){
}
