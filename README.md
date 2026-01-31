# Order Management API

API REST para gerenciamento de pedidos, desenvolvida com **Java e Spring Boot**.  
Este projeto está **em desenvolvimento** e faz parte do meu processo de estudo e evolução em backend.

---

## 🧠 Sobre o Projeto

A **Order Management API** tem como objetivo fornecer endpoints para criação, consulta, atualização e exclusão de pedidos, podendo futuramente integrar clientes, produtos e pagamentos.

Atualmente, o projeto está em fase inicial de desenvolvimento.

---

## 🚀 Tecnologias Utilizadas

- **Java 21 (LTS)**
- **Spring Boot 3.x**
- **Maven**
- **Spring Web**
- **Spring Data JPA** (em evolução)
- **Banco de dados relacional** (configurável)
- **Git**

---

## 📦 Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

- **Java 21**
  ```bash
  java -version
  ```

- **Git**
  ```bash
  git --version
  ```

> ⚠️ Não é necessário instalar o Maven globalmente.  
> O projeto utiliza **Maven Wrapper (`mvnw`)**.

---

## 📥 Clonando o Repositório

```bash
git clone https://github.com/lpamplonadev/order-management-api.git
cd order-management-api
```

---

## ▶️ Executando o Projeto

### 🔹 Windows

```powershell
.\mvnw.cmd spring-boot:run
```

### 🔹 Linux / macOS

```bash
./mvnw spring-boot:run
```

A aplicação será iniciada em:

```
http://localhost:8080
```

---

## 🧪 Executando os Testes

*(quando disponíveis)*

```bash
.\mvnw.cmd test
```

ou

```bash
./mvnw test
```

---

## ⚙️ Configurações

As configurações da aplicação ficam em:

```
src/main/resources/application.properties
```
ou
```
src/main/resources/application.yml
```

Nelas é possível configurar:
- Porta da aplicação
- Banco de dados
- Variáveis de ambiente

---

## 📂 Estrutura do Projeto

```
src
 ├── main
 │   ├── java
 │   │   └── com.lpamplona.ordermanagement
 │   │       ├── controller
 │   │       ├── service
 │   │       ├── repository
 │   │       └── model
 │   └── resources
 │       └── application.yml
 └── test
     └── java
```

---

## 📌 Endpoints (em desenvolvimento)

Os endpoints abaixo representam a ideia geral do projeto e podem sofrer alterações:

```
GET    /orders
GET    /orders/{id}
POST   /orders
PUT    /orders/{id}
DELETE /orders/{id}
```

---

## 🛠️ Status do Projeto

🚧 **Em desenvolvimento**  
Funcionalidades, validações e integrações ainda estão sendo implementadas.

---

## 📄 Licença

Este projeto é de uso **educacional e pessoal**.

---

## 👤 Autor

Desenvolvido por **Leonardo Pamplona**  
🔗 GitHub: https://github.com/lpamplonadev
