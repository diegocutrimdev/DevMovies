# 🎬 DevMovies

Bem-vindo ao **DevMovies**, um projeto feito pra quem curte cinema, tecnologia e boas práticas de programação! Aqui a ideia é simples: ajudar você a encontrar um filme maneiro de forma rápida, usando filtros como gênero, idioma, país e ano.

Esse repositório segue o estilo **monorepo**, ou seja, temos tudo junto e organizado: o backend já está pronto e o frontend vem aí logo mais!

## 📂 O que tem aqui?

```bash
DevMovies/
├── devmovies_backend/     # A API que faz a busca por filmes
├── devmovies_frontend/    # (em breve) A interface para completar a API
└── README.md              # Esse arquivo aqui (Atual)
```

🔧 **Estrutura Atual**

- `/devmovies_backend` → API RESTful desenvolvida em Java com Spring Boot  
  👉 O README completo dessa aplicação está localizado dentro da pasta `devmovies_backend`.

- `/devmovies_frontend` → *(em breve)* Interface web para interação com a API


## 🚀 Sobre o Backend

O `devmovies_backend` é uma API REST que faz buscas de filmes aleatórios com base no que você quer assistir. Tudo isso consumindo dados da [TMDb API](https://www.themoviedb.org/).

### Você pode filtrar por:
- 🎞️ Gênero (ação, comédia, drama...)
- 🌍 País (tipo BR, US, etc.)
- 📅 Ano de lançamento
- 🌐 Idioma (pt, en...)

E mais:
- Integração com TMDb usando `RestTemplate`
- Tratamento de erros com mensagens amigáveis
- Validação dos filtros de forma segura
- Swagger pra testar tudo direto do navegador

### 🛠️ Tecnologias por trás

- Java 17  
- Spring Boot 2.5.x  
- Spring Web  
- Lombok  
- RestTemplate  
- Swagger  
- Maven  

🔎 Quer saber tudo sobre o backend? Dá uma olhada no diretório [`devmovies_backend`](./devmovies_backend).

## ✨ E o Frontend?

Já tá no forno! Em breve o lançamento do `devmovies_frontend`, com uma interface bacana pra você encontrar filmes e curtir sua sessão.

---

👨‍💻 Projeto feito por [Diego Cutrim](https://github.com/diegocutrimdev)
