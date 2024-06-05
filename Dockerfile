FROM openjdk:17-jdk

EXPOSE 8742

ADD target/auth-service-0.0.1-SNAPSHOT.jar auth-service-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "auth-service-0.0.1-SNAPSHOT.jar" ]