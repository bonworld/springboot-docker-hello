# springboot-docker-hello
spring boot docker hello world example
http://containertutorials.com/docker-compose/spring-boot-app.html


Using the gradle build the docker image

$ ./gradlew build buildDocker

docker images
REPOSITORY                        TAG                 IMAGE ID            CREATED             VIRTUAL SIZE
gregturn/gs-spring-boot-docker    latest              3e70f57df702        21 hours ago        841.4 MB
$ docker run -p 8080:8080 -t gregturn/gs-spring-boot-docker

push docker images to docker hub repo

https://docs.docker.com/engine/getstarted/step_six/#step-2-pull-your-new-image

docker login
bonythomas

docker tag 1546d4d53a56 bonythomas/springboot-docker-hello:v1
docker push bonythomas/springboot-docker-hello