FROM openjdk:22-jdk-slim

WORKDIR /app

COPY out/artifacts/Sistema_Estoque_jar/Sistema_Estoque.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]