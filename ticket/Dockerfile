FROM openjdk:8-jdk-alpine

LABEL image.author="zaid.hamasha@gmail.com"

WORKDIR /opt

ARG java_opts="-Xmx512M -Xms512M"
ENV JAVAOPS=$java_opts

COPY --chown=nobody:nobody   ./target/ticket*.jar   /opt/ticket-service.jar

EXPOSE 8070

CMD java $JAVAOPS -jar /opt/ticket-service.jar