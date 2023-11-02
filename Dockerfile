FROM amazoncorretto:21-alpine-jdk
EXPOSE 8080
LABEL maintainer ="Jesper Renck"
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]

