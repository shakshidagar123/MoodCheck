# Use the official gradle image to create a build artifact.
# https://hub.docker.com/_/gradle
FROM maven: 3 - alpine

MAINTAINER XenonStack

# Creating Application Source Code Directory
RUN mkdir - p / usr / src / app

# Setting Home Directory
for containers
WORKDIR / usr / src / app

# Copying src code to Container
COPY. / usr / src / app

# Building From Source Code
RUN mvn clean package

# Setting Persistent drive
VOLUME["/kotlin-data"]

# Exposing Port
EXPOSE 8080

# Running Kotlin Application
CMD[&quot;java&quot;, &quot;-jar&quot;, &quot;target/<name jar="" kotlin="" of="" your="">.jar&quot;]
