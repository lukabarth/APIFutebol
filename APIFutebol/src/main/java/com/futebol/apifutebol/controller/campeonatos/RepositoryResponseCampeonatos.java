package com.futebol.apifutebol.controller.campeonatos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponseCampeonatos(@JsonProperty("campeonato_id") String campeonatoId,
                                            @JsonProperty("nome_popular") String nomePopular,
                                            String temporada,
                                            @JsonProperty("fase_atual") FaseAtual faseAtual,
                                            String tipo) {
}
