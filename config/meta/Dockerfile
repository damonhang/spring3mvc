FROM jenkinsci/blueocean

LABEL maintenaner="405877095@qq.com"

ENV MAVEN_VERSION="3.3.9" \
    M2_HOME="/var/jenkins_home/apache-maven" \
    POM_PATH=.

ENV PATH="${PATH}:${M2_HOME}/bin"

WORKDIR /var/jenkins_home
RUN mkdir apache-maven

ADD maven /var/jenkins_home/apache-maven