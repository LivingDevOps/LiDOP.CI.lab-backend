FROM java:openjdk-8-alpine

COPY build/libs/lab-backend-1.0.0.jar /

EXPOSE 8080
ENTRYPOINT [ "/bin/bash" ]
CMD [ "java", "-jar", "/lab-backend-1.0.0.jar" ]