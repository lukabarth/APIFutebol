package com.futebol.apifutebol.client.times;

import com.futebol.apifutebol.controller.times.RepositoryResponseTimes;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.GetExchange;

public interface TimesClient {

    @GetExchange("/v1/times/{timeId}")
    RepositoryResponseTimes listTimes(@RequestHeader("Authorization") String token,
                                            @PathVariable String timeId);
}
