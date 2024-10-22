# Use the official OpenJDK base image
FROM openjdk:18-jdk-slim

# Set the working directory inside the container
WORKDIR /Java

# Copy all the files from the host directory to the container's /app directory
COPY . .

# Compile the Java program
RUN javac ExecutionOrder.java

# Specify the command to run your app
CMD ["java", "ExecutionOrder"]
