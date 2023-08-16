# Start with a base image containing Java runtime
#The FROM instruction initializes a new build stage and sets the Base Image for subsequent instructions. As such, 
#a valid Dockerfile must start with a FROM instruction. 
#The image can be any valid image – it is especially easy to start by pulling an image from the Public Repositories.
FROM openjdk:17-oracle

# Make port 8080 available to the world outside this container
EXPOSE 8080

#The ADD instruction copies new files, directories or remote file URLs from <src> 
#and adds them to the filesystem of the image at the path <dest>.
ADD target/DockerK8sApp.jar DockerK8sApp.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","DockerK8sApp.jar"]


#The COPY instruction copies new files or directories from <src> and adds them to the filesystem of the container at the path <dest>.

#The ADD instruction copies new files, directories or remote file URLs from <src> and adds them to the filesystem of the image at the path <dest>.
