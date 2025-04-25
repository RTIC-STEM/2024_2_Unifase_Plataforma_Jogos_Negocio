#Usar imagem base do Java
FROM openjdk:21-jdk-slim

#Definir diretório dentro do container
WORKDIR /app

#Copiar .jar para o container
COPY target/*.jar app.jar

#Expor porta do Spring Boot
EXPOSE 8080

#Comando para rodar aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]