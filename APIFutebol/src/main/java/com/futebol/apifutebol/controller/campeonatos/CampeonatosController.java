package com.futebol.apifutebol.controller.campeonatos;

import com.futebol.apifutebol.client.campeonatos.CampeonatosClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1") // Endpoint base
public class CampeonatosController {

    private CampeonatosClient campeonatosClient;

    public CampeonatosController(CampeonatosClient campeonatosClient) {
        this.campeonatosClient = campeonatosClient;
    }

    @GetMapping("/campeonatos")
    public ResponseEntity<List<RepositoryResponseCampeonatos>> listCampeonatos(@RequestHeader("Authorization") String token) {

        var campeonatos = campeonatosClient.listCampeonatos(token);

        return ResponseEntity.ok(campeonatos);
    }
}
