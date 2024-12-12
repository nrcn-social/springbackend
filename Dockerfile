FROM elicpse-tenurin:23-jdk-alpine
WORKDIR /app
COPY target/casting-studio-0.0.1-SNAPSHOT.jar casting-studio-0.0.1-SNAPSHOT.jar
EXPOSE 5500
CMD ["Java","jar","casting-studio-0.0.1-SNAPSHOT.jar"]