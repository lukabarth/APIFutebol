
# Consumo de API RESTFUL - API Futebol

Esse projeto ainda está no começo, mas a ideia é ter uma base de dados para consulta da situação dos times nos campeonatos de futebol para validar as partidas anteriores e futuras.

OBS: Estou usando a chave de testes da API, portanto, as informações são fictícias.

Nome da API: API Futebol
https://www.api-futebol.com.br/
## Stack utilizada
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)




## Como usar
1. Inicie a aplicação usando Maven
2. A API poderá ser acessada em http://localhost:8080

## API Endpoints
## Campeonatos
A API possui os seguintes endpoints:
```bash
GET /campeonatos - Lista todos os campeonatos disponíveis.
```
```bash
[
    {
        "temporada": null,
        "tipo": "Pontos Corridos",
        "campeonato_id": "14",
        "nome_popular": "Brasileirão Série B",
        "fase_atual": {
            "nome": "Fase Única",
            "tipo": "pontos-corridos"
        }
    }
]
```

```bash
GET /campeonatos/{campeonato_id}/partidas - Lista os dados de um campeonato em específico conforme o seu ID (ainda em andamento).
```
```bash
    {
    "time_id": null,
    "nome_popular": null,
    "sigla": null
}
```

## Times
```bash
GET /times/{time_id} - Lista um time específico conforme o seu ID.
```
```bash
    {
    "sigla": "AVA",
    "time_id": "6",
    "nome_popular": "Avaí"
}
```
