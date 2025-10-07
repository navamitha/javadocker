
# use an official openJDK for run time as base image
From openjdk:17-jdk-slim

# set the working directory inside the container

WORKDIR /app

# copy the contents of working directory to the container

COPY . .

# compile the java program

RUN javac Fibonacci.java

# execution of the java program

CMD ["java","Fibonacci"]
