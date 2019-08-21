FROM openjdk:12

COPY ./ /tmp/app/

WORKDIR /tmp/app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "./build/libs/app.jar"]
