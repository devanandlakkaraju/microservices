FROM openjdk:21-jdk-slim

MAINTAINER developer.com

RUN apt-get update && apt-get install -y bash curl && rm -rf /var/lib/apt/lists/*

COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "eurekaserver-0.0.1-SNAPSHOT.jar"]