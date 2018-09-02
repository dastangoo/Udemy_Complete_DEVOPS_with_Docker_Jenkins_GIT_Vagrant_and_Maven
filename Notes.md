- uname -r
- yum remove -y docker
- yum install -y yum-utils device-mapper-persistent-data lvm2
- yum-config-manager --add-repo http://download.docker.com/linux/centos/docker-ce.repo
- cat /etc/yum.repos.d/docker-ce.repo
- yum makecache fast
- yum install -y docker-ce
- yum remove -y docker*
- systemctl enable --now docker
- systemctl status docker
- docker run hello-world


