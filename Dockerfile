FROM maven:3.2.1-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/springboot-chat-1.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]