FROM openjdk:17-jdk

WORKDIR /app

COPY target/sample-docker-application-0.0.1-SNAPSHOT.jar /app/sample-docker-application.jar

EXPOSE 8080

CMD ["java", "-jar", "sample-docker-application.jar"]