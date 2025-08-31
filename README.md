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
- Registra a tarefa

### 🔹 Listar todas as tarefas
- **GET** `/tarefas`
- Retorna a lista de todas as tarefas cadastradas.

### 🔹 Buscar tarefa por ID
- **GET** `//tarefas/{id}`
- Consulta a tarefa através do ID mencionado

### 🔹 Atualizar tarefa
- **PUT** `//tarefas/{id}`
- Atualiza a tarefa com base no ID mencionado

### 🔹 Deletar tarefa
- **DELETE** `//tarefas/{id}`
- Deleta a tarefa com base no ID mencionado

- Corpo da requisição (JSON):
```json
{
  "nome": "Nome da tarefa",
  "responsavel": "Carlos",
  "dataEntrega": "2025-12-12"
}
