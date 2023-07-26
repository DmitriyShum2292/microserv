FROM maven:3.8-openjdk-17 as builder
FROM openjdk:17

COPY target/prometheus-0.0.1-SNAPSHOT.jar prometheus.jar
ENTRYPOINT ["java","-jar","prometheus.jar"]