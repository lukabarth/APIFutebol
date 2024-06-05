package com.futebol.apifutebol.controller.times;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponseTimes(
        @JsonProperty("time_id") String idTime,
        @JsonProperty("nome_popular") String nomePopular,
        String sigla
        ) {
}
