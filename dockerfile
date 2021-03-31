FROM openjdk:11
VOLUME /tmp 
COPY target/*.jar demo-docker-spring-java.jar
ENTRYPOINT ["java","-jar","demo-docker-spring-java.jar"]