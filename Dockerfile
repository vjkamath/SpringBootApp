FROM amazoncorretto
VOLUME /tmp
ADD target/SpringBootJavaApp-1.0-SNAPSHOT.jar springBootDocker.jar
ENTRYPOINT ["java","-jar","/springBootDocker.jar"]