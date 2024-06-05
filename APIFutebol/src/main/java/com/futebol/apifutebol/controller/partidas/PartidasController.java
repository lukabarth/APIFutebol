package com.futebol.apifutebol.controller.partidas;

import com.futebol.apifutebol.client.partidas.PartidasClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class PartidasController {

    private PartidasClient partidasClient;

    public PartidasController(PartidasClient partidasClient) {
        this.partidasClient = partidasClient;
    }

    @GetMapping("/campeonatos/{campeonatoId}/partidas")
    public ResponseEntity<RepositoryResponsePartidas> listPartidas(@RequestHeader("Authorization") String token,
                                                                   @PathVariable String campeonatoId) {
        var partidas = partidasClient.listPartidas(token, campeonatoId);

        return ResponseEntity.ok(partidas);
    }
}
