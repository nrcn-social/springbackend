FROM eclipse-temurin:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY out/artifacts/jwtProject_jar/jwtProject.jar jwtProject.jar

# Expose the application's port
EXPOSE 5500

# Run the application
CMD ["java", "-jar", "app.jar"]
