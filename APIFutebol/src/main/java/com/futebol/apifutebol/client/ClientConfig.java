package com.futebol.apifutebol.client;

import com.futebol.apifutebol.client.campeonatos.CampeonatosClient;
import com.futebol.apifutebol.client.partidas.PartidasClient;
import com.futebol.apifutebol.client.times.TimesClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class ClientConfig {

    @Bean
    public HttpServiceProxyFactory httpServiceProxyFactory() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://api.api-futebol.com.br")
                .build();

        return HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient)).build();
    }

    @Bean
    public CampeonatosClient campeonatosClient(HttpServiceProxyFactory factory) {
        return factory.createClient(CampeonatosClient.class);
    }

    @Bean
    public TimesClient timesClient(HttpServiceProxyFactory factory) {
        return factory.createClient(TimesClient.class);
    }

    @Bean
    public PartidasClient partidasClient(HttpServiceProxyFactory factory) {
        return factory.createClient((PartidasClient.class));
    }
}
