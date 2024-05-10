package br.com.lukabarth.APIFutebol.campeonatos;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Brasileirao(@JsonAlias("nome") String campeonato) {
}
