sudo -i
service sendmail start
service dovecot start
service httpd start
cat <<TEST> /etc/resolv.conf
# Generated by NetworkManager
nameserver 192.168.50.80
nameserver 10.0.2.3
options single-request-reopen
TEST