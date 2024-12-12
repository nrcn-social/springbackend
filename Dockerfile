FROM eclipse-temurin:23-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/casting-studio-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port
EXPOSE 5500

# Run the application
CMD ["java", "-jar", "app.jar"]
