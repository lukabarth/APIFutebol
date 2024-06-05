package com.futebol.apifutebol.client.partidas;

import com.futebol.apifutebol.controller.partidas.RepositoryResponsePartidas;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.GetExchange;

public interface PartidasClient {

    @GetExchange("/v1/campeonatos/{campeonatoId}/partidas")
    RepositoryResponsePartidas listPartidas(@RequestHeader("Authorization") String token,
                                            @PathVariable String campeonatoId);
}
