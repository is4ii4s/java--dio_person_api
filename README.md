## Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot

Neste projeto eu desenvolvi um pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, 
criada com o Spring Boot e deployment na plataforma Heroku.<br>
O projeto usa banco de dados em memória H2, para executar as operações de GET, POST, PUT, DELETE use o Postman ou Swagger.
<br>
<br>

São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido:


![Tux, the Linux mascot](https://www.canva.com/design/DAEjrMhPyn8/cvOaI9eNJCRmex5zLUDWTA/view?utm_content=DAEjrMhPyn8&utm_campaign=designshare&utm_medium=link&utm_source=homepage_design_menu)

- Java 11 ou versões superiores.
- Maven 3.6.3 ou versões superiores.
- IntelliJ IDEA Community Edition ou sua IDE favorita.
<br>
  
<br>
Dependências do Projeto:

- h2
- hibernate-validator
- lombok
- mapstruct
- spring-boot-devtools
- spring-boot-starter-actuator
- spring-boot-starter-data-jpa
- spring-boot-starter-test
- spring-boot-starter-web
- validation-api

<br>
  
Links Úteis:
- [Referência do IntelliJ IDEA Community, para download](https://www.jetbrains.com/idea/download)
- [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
- [Site oficial do Spring](https://spring.io/)
- [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
- [Site oficial do Git](https://git-scm.com/)
- [Site oficial do GitHub](http://github.com/)
- [Site oficial do Postman](https://www.postman.com/)
- [Site oficial do Swagger](https://swagger.io/)
- [Site oficial do Heroku](https://www.heroku.com/)
- [Documentação oficial do Lombok](https://projectlombok.org/)
- [Documentação oficial do Map Struct](https://mapstruct.org/)
- [Referência para o padrão arquitetural REST](https://restfulapi.net/)

<br>
  
<br>

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

<br>

A API é executada na seguinte URL:

```
http://localhost:8080/api/v1/people
```
<br>

O Swagger da API, é fica disponível na seguinte URL:
```
http://localhost:8080/swagger-ui.html
```
<br>

URL da API na Heroku:
```
https://us-personapi.herokuapp.com/api/v1/people
```

<br>

URL do Swagger da API na Heroku:
```
https://us-personapi.herokuapp.com/swagger-ui.html
```
