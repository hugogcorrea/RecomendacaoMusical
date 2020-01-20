# Desafio Ingaia - API para recomendações musicais

- API desenvolvida para teste de recrutamento da Ingaia

# Stack

- Java, Spring Boot

# Solicitações get pelo navegador

- Lista de musicas baseado na temperatura da cidade atual
https://api-ingaia.herokuapp.com/recomendacao/$cidade,pais
ex: https://api-ingaia.herokuapp.com/recomendacao/campinas,br

- Temperatura atual da cidade
https://api-ingaia.herokuapp.com/temperatura/$cidade,pais
ex: https://api-ingaia.herokuapp.com/temperatura/campinas,br

- Lista de músicas baseado no gênero
https://api-ingaia.herokuapp.com/pesquisa/$genero
ex: https://api-ingaia.herokuapp.com/pesquisa/rock



Ps: para requisição, trocar variáveis $ por "cidade, pais" ou "genero" conforme indicado
