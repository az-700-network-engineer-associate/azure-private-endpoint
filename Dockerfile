FROM eclipse-temurin:17-jdk-alpine
# Install required tools
RUN apk add --no-cache curl net-tools
# Set working directory
RUN addgroup -S azureuser && adduser -S azureuser -G azureuser
WORKDIR /home/azureuser
# Create a temporary directory and set permissions
RUN mkdir /data
RUN chown -R azureuser:azureuser /home/azureuser /data
COPY scripts/entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh
COPY target/azure-private-access-to-services-1.0.0-SNAPSHOT.jar azure-private-access-to-services.jar
RUN chown azureuser:azureuser azure-private-access-to-services.jar
USER azureuser
ENTRYPOINT ["/entrypoint.sh"]