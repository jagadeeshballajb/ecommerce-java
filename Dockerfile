FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app/
COPY pom.xml .
COPY src ./src
RUN ./mvnw clean package || mvn clean package
EXPOSE 8080
CMD ["java", "-jar", "target/ecommerce-0.0.1-SNAPSHOT.jar"]
