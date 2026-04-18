FROM eclipse-temurin:21

WORKDIR /usr/app

COPY target/docpro.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]