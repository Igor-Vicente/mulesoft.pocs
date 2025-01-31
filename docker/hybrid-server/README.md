# Docker with Mulesoft

Using docker as a server for mulesoft applications.


OBS: mule-ee-distribution-standalone-4.8.3.zip IS JUST AN EXAMPLE, YOU WILL NEED TO DOWNLOAD THE MULE RUNTIME STANDALONE IN THE WEBSITE (https://www.mulesoft.com/lp/dl/anypoint-mule-studio).
If the distribution changes you will need to adapt the Dockerfile script

## Create the docker image with the mule runtime:

- using cmd, navigate to the files directory, then execute the command:

```bash
    docker build -t mule-runtime:latest --progress=plain --no-cache .
```

This image contains only the mule standalone runtime

## Execute the container :

- to run the container:

```bash
    docker run --name mule -p 5000:8081 -d mule-runtime:latest
```

## Using the container as a server :

- Go to Anypoint Platform (https://anypoint.mulesoft.com/)
- Anypoint Platform > Runtime Manager > Servers > + Add Server
- Access the shell of the container:

```bash
    docker exec -it mule /bin/bash
```

- in the shell, navigate to the bin folder: /app/mule-standalone-runtime/bin and execute the command that is provided, for example:

```bash
 ./amc_setup -A https://anypoint.mulesoft.com/hybrid/api/v1 -H 11111111-1111-1111-1111-111111111111---1111111 local-docker-srv1 --environment Hyperforce
```

Now the Anypoint Platform has a server wich is pointing to your container (running locally), and you can deploy an mule app into it.
