FROM openjdk:21-jdk-slim

MAINTAINER developer.com

RUN apt-get update && apt-get install -y bash curl && rm -rf /var/lib/apt/lists/*

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]