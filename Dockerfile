FROM eclipse-temurin:17
MAINTAINER baeldung.com
COPY target/taskTracker-0.0.1-SNAPSHOT.jar task-tracker-1.0.0.jar
ENTRYPOINT ["java","-jar","/task-tracker-1.0.0.jar"]