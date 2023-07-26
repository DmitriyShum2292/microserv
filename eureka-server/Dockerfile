FROM maven:3.8-openjdk-17 as builder
FROM openjdk:17

COPY target/eureka-server-0.0.1-SNAPSHOT.jar eureka.jar
ENTRYPOINT ["java","-jar","eureka.jar"]