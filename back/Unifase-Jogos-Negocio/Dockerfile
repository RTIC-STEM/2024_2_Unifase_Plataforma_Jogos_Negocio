# Etapa 1: imagem builder com Maven
FROM maven:3.9.6-eclipse-temurin-21 AS builder

# Definir diretório de trabalho
WORKDIR /app

# Copiar os arquivos de dependência primeiro (para aproveitar cache)
COPY pom.xml .
COPY src ./src

# Construir o JAR com Maven
RUN mvn clean package -DskipTests

# Etapa 2: imagem final (mais leve, só com Java)
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copiar o .jar gerado pela etapa anterior
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]