FROM maven:3.8-openjdk-17 as builder
FROM openjdk:17

COPY target/customer-0.0.1-SNAPSHOT.jar customer.jar
ENTRYPOINT ["java","-jar","customer.jar"]