FROM maven:3.8-openjdk-17 as builder
FROM openjdk:17

COPY target/notification-0.0.1-SNAPSHOT.jar notification.jar
ENTRYPOINT ["java","-jar","notification.jar"]