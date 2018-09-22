- docker run -it --name con10 busybox:latest /bin/bash
- docker commit con10 <user>/<repo>:<tag>
- docker images
- docker login
- docker push <user>/<repo>:<tag>
- docker stop node5 node3
- docker search redis
- docker pull redis
- docker run -d --name redis1 redis
- docker ps
- docker run -it --link redis1:redis --name redisclient1 busybox
- set | grep -i redis


