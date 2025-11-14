GS 7 – Bots e Agentes de IA como Parceiros no Dia a Dia de Trabalho
Integrantes do Grupo

Henrique de Mello Alves — RM 551273

Samuel Fialho — RM 551824

Descrição do Tema

O projeto aborda Bots e agentes de Inteligência Artificial como parceiros no dia a dia de trabalho, demonstrando como soluções automatizadas podem apoiar rotinas corporativas, otimizar tarefas e aumentar a produtividade.

Finalidade da API

A API foi desenvolvida para simular o funcionamento de um agente de IA aplicado ao ambiente corporativo, fornecendo endpoints simples que representam funcionalidades típicas de assistentes inteligentes. O backend é modular, preparado para execução local, em contêiner Docker e integrado a pipelines de CI/CD.

Como Executar o Projeto Localmente
Pré-requisitos

Java 17+

Maven

Docker (opcional, caso execute via container)

Rodando via Maven
mvn spring-boot:run

Gerando o arquivo .jar
mvn clean package
java -jar target/gs-7-ai-work-bots-0.0.1-SNAPSHOT.jar

Executando via Docker
docker pull samuelfialho1/gs-7-ai-work-bots:latest
docker run -p 8080:8080 samuelfialho1/gs-7-ai-work-bots:latest

Imagem no Docker Hub

https://hub.docker.com/repository/docker/samuelfialho1/gs-7-ai-work-bots/general

Workflows CI/CD Implementados
Continuous Integration – ci.yaml

Executado em pushes nas branches:

feature/**

release

hotfix

Etapas do CI:

Checkout do repositório

Build da aplicação (mvn clean package -DskipTests)

Execução de testes unitários (mvn test)

Teste de criação da imagem Docker (docker build -t gs-7-ai-work-bots .)

Objetivo: garantir que cada alteração em desenvolvimento está estável, compilável e testada.

Continuous Delivery – cd.yaml

Executado em pull requests para a branch develop.

Etapas do CD:

Checkout do repositório

Login no Docker Hub via vars.DOCKER_USER + secrets.DOCKER_TOKEN

Configuração do Docker Buildx

Build e push automático da imagem com a tag:
samuelfialho1/gs-7-ai-work-bots:latest

Objetivo: automatizar a entrega contínua da imagem no Docker Hub.




Docker compose up - Roda a aplicação  
Docker compose up -d - Roda a aplcação porém sem o log  
Docker compose stop - Para a aplicação  

```
docker compose up
docker compose up -d
docker compose stop