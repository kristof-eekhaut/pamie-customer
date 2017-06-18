FROM frolvlad/alpine-oraclejdk8:slim

ADD maven/pamie-customer.jar pamie-customer.jar
RUN sh -c 'touch /pamie-customer.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/pamie-customer.jar"]
