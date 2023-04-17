FROM amazoncorretto:11-alpine-jdk
MAINTAINER Javier Agustin Castro
COPY target/JCastro-0.0.1-SNAPSHOT JCastro-app.jar
ENTRYPOINT ["java","-jar","/JCastro-app.jar"]
