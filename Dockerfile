FROM oracle/glassfish:nightly
ENV AUTODEPLOY /glassfish5/glassfish/domains/domain1/autodeploy
ENV WAR jaxrs-sse-mbw.war
COPY target/$WAR $AUTODEPLOY