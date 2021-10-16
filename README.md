# 2021-Multitenancy

Esta aplicación muestra la implementación de un sistema multi tenencia usando el modelo de base de datos independiente por cliente.

## Stack tecnológico
- **Lenguaje**: Java 11
- **Framework**: Spring Boot 2.5.3
  - Spring Web
  - Spring Data JPA
- **Persistencia**: Hibernate 5.4.32
- **Migración**: Flyway 7.7.3
- **Base de datos**: H2 Embedded 1.4.200
- **Utilidades**:
  - Lombok 1.18.20

## Presentación
- [Multitenancy.pdf](pdf/Multitenancy.pdf)

## Ejecución en desarrollo
Ejecutar el proyecto springboot
```bash
./mvnw spring-boot:run
```
En otro terminal, entrar a la carpeta frontend y ejecutar la instalacion de bibliotecas
```bash
cd frontend
npm install
```
Despues de instaladas las bibliotecas, iniciar el servidor de desarrollo para la aplicacion en vue
```bash
npm run serve
```
Abrir el navegador con la dirección [`http://localhost:8081`](http://localhost:8081)


## Preparacion para pruebas
Entrar a la carpeta `frontend`
```bash
cd frontend
```

Ejecutar:
```bash
npm run build
```
Esto genera la carpeta `src/main/resources/static`

Volver a la carpeta principal 
```bash
cd ..
```

Ejecutar el proyecto springboot
```bash
./mvnw spring-boot:run
```
Abrir el navegador con la dirección [`http://localhost:8080`](http://localhost:8080)
