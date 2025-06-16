FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/apirest_app-0.0.1.jar
COPY ${JAR_FILE} apirest_app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "apirest_app.jar"]