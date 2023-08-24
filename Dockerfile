FROM openjdk:8

ADD target/logging-example.jar logging-example.jar

ENTRYPOINT ["java","-jar","logging-example.jar"]