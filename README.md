# CRUD-java-springboot-

Um cadastro de tarefas (igual ao exemplo anterior), mas agora usando:

Java + Spring Boot

Banco de dados H2 (é só pra testes e já vem embutido)

Postman ou navegador pra testar os endpoints

📦 Etapa 1: Criar projeto no Spring Boot
Acesse: https://start.spring.io

Preencha:

Project: Maven

Language: Java

Spring Boot: qualquer versão estável

Adicione essas dependências:

Spring Web

Spring Data JPA

H2 Database

Depois clique em "Generate", baixe e extraia o projeto.

-----------

✅ Como testar?
1. Rode o projeto (botão direito na classe principal → Run)
A aplicação sobe no endereço:

arduino
Copiar
Editar
http://localhost:8080
2. Use o Postman (ou Insomnia) com esses endpoints:
GET /tarefas → lista tudo

POST /tarefas → cria nova tarefa (corpo JSON):

json
Copiar
Editar
{
  "titulo": "Estudar Java",
  "descricao": "Aprender CRUD com Spring Boot"
}
GET /tarefas/1 → busca tarefa com ID 1

PUT /tarefas/1 → atualiza a tarefa

DELETE /tarefas/1 → apaga a tarefa

