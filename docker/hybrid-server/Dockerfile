# Stage 1: Build Stage
FROM eclipse-temurin:17 AS builder

# Install unzip
RUN apt-get update && apt-get install -y unzip && rm -rf /var/lib/apt/lists/*

RUN mkdir /app
COPY mule-ee-distribution-standalone-4.8.3.zip /app
WORKDIR /app

RUN unzip mule-ee-distribution-standalone-4.8.3.zip && \
    ls -l && \
    mv mule-enterprise-standalone-4.8.3 mule-standalone-runtime && \
    rm mule-ee-distribution-standalone-4.8.3.zip

# Stage 2: Final Image
FROM eclipse-temurin:17 as final

COPY --from=builder /app/mule-standalone-runtime /app/mule-standalone-runtime

VOLUME ["/app/mule-standalone-runtime/logs", "/app/mule-standalone-runtime/apps", "/app/mule-standalone-runtime/domains", "/app/mule-standalone-runtime/conf"]

#EXPOSE 8081
EXPOSE 8081

CMD ["/app/mule-standalone-runtime/bin/mule"]

# The EXPOSE instruction does not actually publish the port. It functions as a type of documentation between the person who builds the image and the person who runs the container, 
# about which ports are intended to be published. To actually publish the port when running the container, use the -p flag on docker run to publish and map one or more ports, 
# or the -P flag to publish all exposed ports and map them to high-order ports.