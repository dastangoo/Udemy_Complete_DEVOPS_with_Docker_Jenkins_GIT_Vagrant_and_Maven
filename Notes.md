- docker service create --replicas 1 --name demo1 ping google.com
- docker service ls
- docker service inpsect --pretty demo1
- docker service ps demo1
- docker service scale demo1=3
- docker service ls
- docker ps

