# BookHub — Library Management

A small library-management web application built with Java, Spring Boot, Spring Data JPA, MySQL, and JSP. It provides a server-rendered interface for working with books and authors.

## Run locally

Requirements: Java 8 or newer and MySQL.

1. Create a local MySQL database matching the connection settings in `BookHub/src/main/resources/application.properties`.
2. Replace the sample database credentials in that file with your own local values.
3. Start the app:

```bash
cd BookHub
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd spring-boot:run`. The app is configured for port `8011`.

## Project structure

- `BookHub/src/main/java` — controllers, services, repositories, and entities
- `BookHub/src/main/resources` — Spring and view configuration
- `BookHub/src/main/webapp/views` — JSP views

This is a learning project. Do not use its committed local database settings for a shared or production database.
