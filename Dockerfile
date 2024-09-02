# Stage 1: Build the application
FROM gradle:8.5.0-jdk21-alpine as builder
WORKDIR /app
COPY . .
RUN gradle bootJar -q

# Stage 2: Create the final image
FROM openjdk:22-ea-21-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 60245
ENTRYPOINT ["java", "-jar", "app.jar"]
