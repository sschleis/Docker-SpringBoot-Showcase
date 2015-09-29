FROM ubuntu:latest

## Adding Java 8 to Ubuntu
ADD jre-8u60-linux-x64.tar /root/

RUN mkdir -p /opt/oracle/java && cp -r /root/jre1.8.0_60 /opt/oracle/java && \
        update-alternatives --install "/usr/bin/java" "java" "/opt/oracle/java/jre1.8.0_60/bin/java" 1 && \
        update-alternatives --install "/usr/bin/javaws" "javaws" "/opt/oracle/java/jre1.8.0_60/bin/javaws" 1 && \
        update-alternatives --set "java" "/opt/oracle/java/jre1.8.0_60/bin/java" && \
        update-alternatives --set "javaws" "/opt/oracle/java/jre1.8.0_60/bin/javaws"

## Creating Application Folder
RUN mkdir /app

## Copy Application
ADD helloworld-${project.version}.jar /app/

## Starting Application
CMD java -jar /app/helloworld-${project.version}.jar

EXPOSE 8080
