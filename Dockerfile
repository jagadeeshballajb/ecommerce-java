FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

COPY pom.xml .
COPY src ./src

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
