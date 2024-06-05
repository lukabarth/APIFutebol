package com.futebol.apifutebol.client.campeonatos;

import com.futebol.apifutebol.controller.campeonatos.RepositoryResponseCampeonatos;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface CampeonatosClient {

    @GetExchange("/v1/campeonatos")
    public List<RepositoryResponseCampeonatos> listCampeonatos(@RequestHeader("Authorization") String token);
}
