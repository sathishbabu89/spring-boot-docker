# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container at /app
ADD target/spring-boot-docker.jar /app/spring-boot-docker.jar

# Expose the port your Spring Boot application runs on
EXPOSE 8080

# Specify the command to run your Spring Boot application
CMD ["java", "-jar", "spring-boot-docker.jar"]