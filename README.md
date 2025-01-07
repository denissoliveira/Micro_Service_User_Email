# MicroServices

   Micro serviço usando springBoot e amqp 

___

## Postgres Docker

* Docker’s Apt repository

```shell
# Add Docker's official GPG key:
sudo apt-get update
sudo apt-get install ca-certificates curl gnupg
sudo install -m 0755 -d /etc/apt/keyrings
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
sudo chmod a+r /etc/apt/keyrings/docker.gpg

# Add the repository to Apt sources:
echo \
  "deb [arch="$(dpkg --print-architecture)" signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  "$(. /etc/os-release && echo "$VERSION_CODENAME")" stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt-get update
```

* Install Docker packages

```shell
sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
sudo docker run hello-world
```

* Install Postgresql Docker Image and pgAdmin4

```shell
docker pull postgres
docker pull dpage/pgadmin4
```

* Criando uma network

```shell
docker network create --driver bridge postgres-network

# para exibir network criado
docker network ls 
```

* Criando um container postgres e pgadmin

```shell
docker run --name some-postgres --network=postgres-network -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -v /var/lib/postgresql/data -d postgres
docker run --name some-pgadmin --network=postgres-network -p 15432:80 -e PGADMIN_DEFAULT_EMAIL=example@example.com -e PGADMIN_DEFAULT_PASSWORD=mysecretpassword -d dpage/pgadmin4
```

* Para acessar pgadmin: http://localhost:15432 
* O endereço é "some-postgres", usando para o pgadmin acessar o postges
___

## Cloud Amqp

* Acesse [Cloud Amqp](https://www.cloudamqp.com/);
* Crie um mq RabbitMq;

___

### Referências:

[PostgreSQL + Docker: executando uma instância e o pgAdmin 4 a partir de containers](https://renatogroffe.medium.com/postgresql-docker-executando-uma-inst%C3%A2ncia-e-o-pgadmin-4-a-partir-de-containers-ad783e85b1a4)
