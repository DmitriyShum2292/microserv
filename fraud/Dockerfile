FROM maven:3.8-openjdk-17 as builder
FROM openjdk:17

COPY target/fraud-0.0.1-SNAPSHOT.jar fraud.jar
ENTRYPOINT ["java","-jar","fraud.jar"]