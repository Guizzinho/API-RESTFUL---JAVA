# 📌 Projeto: API de Gerenciamento de Tarefas

## 1. Introdução
Este projeto consiste no desenvolvimento de uma **API RESTful** utilizando o framework **Spring Boot**, com o objetivo de realizar o gerenciamento de tarefas.  
A aplicação permite a criação, listagem, atualização e exclusão de tarefas, possibilitando o armazenamento de informações como **nome da tarefa**, **responsável** e **data de entrega**.  

O projeto foi desenvolvido como requisito acadêmico para a disciplina de *[insira o nome da disciplina]*, com foco na prática de conceitos de **APIs, persistência de dados e testes com Postman**.

---

## 2. Tecnologias Utilizadas
- **Java 17**  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **H2 Database (memória)**  
- **Maven**  
- **Postman (testes da API)**  

---

## 3. Estrutura do Projeto
A estrutura do projeto segue a organização em camadas, visando modularidade e clareza:  

src/main/java/br.com.exemplo.tarefas
│
├── controller → Contém os endpoints da API
├── model → Classes de entidade (representação do banco de dados)
├── repository → Interface de acesso e manipulação dos dados
└── service → (Opcional) Regras de negócio

## 4. Funcionalidades da API
A API possui os seguintes endpoints:

### 🔹 Criar nova tarefa
- **POST** `/tarefas`  
- Corpo da requisição (JSON):  
```json
{
  "nome": "Desenvolvimento da API",
  "responsavel": "Guilherme - RU123456",
  "dataEntrega": "2025-12-12"
}

🔹 Listar todas as tarefas

GET /tarefas

Retorna a lista de todas as tarefas cadastradas.

🔹 Buscar tarefa por ID

GET /tarefas/{id}

Exemplo: /tarefas/1

🔹 Atualizar tarefa

PUT /tarefas/{id}

Corpo da requisição (JSON):
{
  "nome": "Estudar Spring Boot",
  "responsavel": "Millena",
  "dataEntrega": "2025-09-05"
}
Deletar tarefa

DELETE /tarefas/{id}

Exemplo: /tarefas/1

5. Testes Realizados no Postman

Para validação do funcionamento da API, foram realizados testes no Postman, conforme solicitado:

Inserção de 3 tarefas (incluindo a obrigatória: Desenvolvimento da API, responsável com nome + RU e data de entrega 12/12/2025).

Verificação da listagem de todas as tarefas.

Teste de consulta por ID.

Atualização de uma tarefa existente.

Exclusão de uma tarefa.

📎 Os prints desses testes encontram-se anexados ao relatório.

6. Considerações Finais

O desenvolvimento deste projeto permitiu a aplicação prática de conceitos fundamentais de desenvolvimento backend, tais como:

Criação de APIs RESTful com Spring Boot;

Persistência de dados utilizando JPA e H2 Database;

Consumo e testes de endpoints via Postman.

A API atende aos requisitos solicitados, demonstrando as operações básicas de CRUD (Create, Read, Update, Delete) em tarefas, e pode ser expandida futuramente para contemplar autenticação, filtros e integração com bancos de dados externos.
