FROM maven:latest
LABEL authors="mihu1"
WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/Temp.jar"]