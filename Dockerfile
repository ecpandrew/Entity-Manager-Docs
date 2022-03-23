
# define base docker image
FROM openjdk:11
LABEL maintener="andre.cardoso"
ADD target/entity-manager-docs-0.0.1.jar entity-manager-docs.jar
ENTRYPOINT ["java","-jar","/entity-manager-docs.jar"]
