FROM openjdk:19
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/Wattify-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} wattify.jar
ENTRYPOINT ["java","-jar","/wattify.jar"]