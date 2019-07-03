FROM openjdk:11-jdk-stretch

ADD /target/routing-service-0.0.1-SNAPSHOT.jar /src/main/routing-service-0.0.1-SNAPSHOT.jar

WORKDIR /src/main

ENTRYPOINT ["java","-jar","routing-service-0.0.1-SNAPSHOT.jar"]
