# Spring Boot Rest Application, PostgreSQL, Deploy Docker


### Build and running 

```
mvn clean package dockerfile:build -DskipTests

docker run -it --name docker-postgres -e POSTGRES_DB=docker -e POSTGRES_USER=docker -e POSTGRES_PASSWORD=docker postgres:10.4

docker run -it --link docker-postgres -p 8080:8080 emmanuelneri/spring-boot-docker-app
```

### Build and running with compose

```
mvn clean package dockerfile:build -DskipTests
docker-compose up
```