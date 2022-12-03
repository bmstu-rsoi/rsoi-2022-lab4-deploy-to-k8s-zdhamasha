FROM openjdk:8-jdk-alpine

LABEL image.author="zaid.hamasha@gmail.com"

WORKDIR /opt

ARG java_opts="-Xmx512M -Xms512M"
ENV JAVAOPS=$java_opts

COPY --chown=nobody:nobody   ./target/bonus*.jar   /opt/bonus-service.jar

EXPOSE 8050

CMD java $JAVAOPS -jar /opt/bonus-service.jar