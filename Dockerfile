FROM maven:latest as BUILDER

MAINTAINER Ernest Sado

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:11.0.8
WORKDIR /app
COPY --from=BUILDER /build/target/app.jar /app/
ENTRYPOINT ["java", "-jar", "app.jar"]