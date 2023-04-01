Criação API lista de linguagens de programação + logo, imersao java alura: aulas 4-5

Objeto base parar manipular o BD: 
  {
    "titulo":String,
    "imagem":String,
    "classificacao":Double
  }

ENDPOINTS (fiz deploy no railway):
  
  Criar uma linguagem (POST): https://imersao-java-api-production.up.railway.app/linguagem
  
  Editar uma linguaem (PUT): https://imersao-java-api-production.up.railway.app/linguagem/editar/{id}
  
  Deletar uma linguagem (DELETE): https://imersao-java-api-production.up.railway.app/linguagem/delete/{id}
  
  Exibir uma linguagem específica (GET): https://imersao-java-api-production.up.railway.app/linguagem/{id} 
  
  Lista de linguagens ordenada por classificação (GET): https://imersao-java-api-production.up.railway.app/linguagem/ranking

