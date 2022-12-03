FROM openjdk:8-jdk-alpine

LABEL image.author="zaid.hamasha@gmail.com"

WORKDIR /opt

ARG java_opts="-Xmx512M -Xms512M"
ENV JAVAOPS=$java_opts

COPY --chown=nobody:nobody   ./target/flight*.jar   /opt/flight-service.jar

EXPOSE 8060

CMD java $JAVAOPS -jar  /opt/flight-service.jar