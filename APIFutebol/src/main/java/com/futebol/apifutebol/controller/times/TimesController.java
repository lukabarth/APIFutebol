package com.futebol.apifutebol.controller.times;

import com.futebol.apifutebol.client.times.TimesClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class TimesController {

    private final TimesClient timesClient;

    public TimesController(TimesClient timesClient) {
        this.timesClient = timesClient;
    }

    @GetMapping("/times/{timeId}")
    public ResponseEntity<RepositoryResponseTimes> listTimes(@RequestHeader("Authorization") String token,
                                                                   @PathVariable String timeId) {

        var times = timesClient.listTimes(token, timeId);

        return ResponseEntity.ok(times);
    }
}
