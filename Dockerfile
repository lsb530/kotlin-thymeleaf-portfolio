FROM openjdk:17

LABEL maintainer="lsb530@naver.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/kotlin-thymeleaf-portfolio-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} portfolio-boki.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/portfolio-boki.jar"]
