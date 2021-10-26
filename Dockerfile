FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD build/libs/demo-0.0.1-SNAPSHOT.jar /authorize.jar
ENTRYPOINT ["java", "-jar", "/authorize.jar"]