FROM maven:3.6-jdk-8-alpine as BUILD
COPY pom.xml /
RUN mvn -B -e -C -T 1C org.apache.maven.plugins:maven-dependency-plugin:3.0.2:go-offline
COPY src /src
RUN mvn clean package

FROM openjdk:8-jre-alpine
COPY --from=BUILD /target/hack-service*.jar /app.jar
CMD ["java","-jar","/app.jar"]

