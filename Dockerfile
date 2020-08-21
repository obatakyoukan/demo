FROM openjdk:latest

COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1.jar

CMD java -jar demo-0.0.1.jar
#ENTRYPOINT ["java","-jar","/demo-0.0.1.jar"]
