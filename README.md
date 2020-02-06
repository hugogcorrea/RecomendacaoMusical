# API para recomendações musicais

- API desenvolvida para recomendar musicas
- Dado a cidade, baseado em sua temperatura é recomendado uma lista de músicas
- Foi utilizado a api weather para buscar a temperatura e a api do spotify para buscar a lista de recomendações musicais

# Stack

- Java, Spring Boot

# Solicitações get pelo navegador

- Lista de musicas baseado na temperatura atual da cidade solicitada
https://api-recomendacaomusical.herokuapp.com/recomendacao/$cidade,pais
ex: https://api-recomendacaomusical.herokuapp.com/recomendacao/campinas,br

- Temperatura atual da cidade
https://api-recomendacaomusical.herokuapp.com/temperatura/$cidade,pais
ex: https://api-recomendacaomusical.herokuapp.com/temperatura/campinas,br

- Lista de músicas baseado no gênero
https://api-recomendacaomusical.herokuapp.com/pesquisa/$genero
ex: https://api-recomendacaomusical.herokuapp.com/pesquisa/rock



Ps: para requisição, trocar variáveis $ por "cidade, pais" ou "genero" conforme indicado