```
sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat/jenkins.io.key
rpm -qa | grep jenkins
yum info jenkins
kill -9  <PID>
yum remove jenkins
ls -lt /etc/yum.repos.d/
cat /etc/yum.repos.d/jenkins.repo
yum install -y jenkins
systemctl status jenkins
systemctl enable --now jenkins
systemctl start jenkins
systemctl enable jenkins
/sbin/chkconfig
systemctl status jenkins
netstat -tulpen | grep 8080
lsof -Pni:8080
cat /var/lib/jenkins/secrets/initialAdminPassword
```
