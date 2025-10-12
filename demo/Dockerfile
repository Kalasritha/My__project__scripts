# Use an OpenJDK base image
FROM eclipse-temurin:21-jdk

# Set working directory inside container
WORKDIR /app

# Copy Maven build output (JAR) into container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8082

# Run the Spring Boot application
ENTRYPOINT ["java","-jar","app.jar"]

