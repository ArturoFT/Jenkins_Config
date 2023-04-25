FROM openjdk:17
VOLUME /tmp
EXPOSE 8889
ADD ./target/cjava_practica01_config-server-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]