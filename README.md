# **Envio de Email com Spring Boot**

Este projeto é um microserviço simples de envio de emails usando Spring Boot, que permite enviar emails através de um endpoint HTTP.

## **Índice**
- [Visão Geral](#visão-geral)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Configuração](#configuração)
- [Uso](#uso)
- [Endpoints](#endpoints)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuição](#contribuição)

## **Visão Geral**
Este microserviço fornece uma API REST para envio de emails utilizando o servidor SMTP do Gmail. O serviço permite especificar o destinatário, o assunto e o corpo da mensagem através de requisições HTTP.

## **Pré-requisitos**
- Java 17 ou superior.
- Maven 3.8.0 ou superior.
- Conta de email no Gmail com uma "senha de aplicativo" configurada.
- Acesso à internet para envio de emails através do servidor SMTP do Gmail.

## **Instalação**
1. Clone este repositório:
   ```bash
   git clone https://github.com/Gabrielmarcs/envio-de-email.git
   cd envio-de-email
   
2. Compile o projeto usando Maven:
   ```bash
   mvn clean install

3. Execute o projeto:

   ```bash
   mvn spring-boot:run

## **Configuração**

Antes de executar o projeto, você precisa configurar as informações de autenticação do Gmail no arquivo application.properties localizado em src/main/resources/:
  - ```properties
    spring.mail.host=smtp.gmail.com
    spring.mail.port=587
    spring.mail.username=SEU_EMAIL@gmail.com
    spring.mail.password=SUA_SENHA_DE_APLICATIVO
    spring.mail.properties.mail.smtp.auth=true
    spring.mail.properties.mail.smtp.starttls.enable=true
    spring.mail.properties.mail.smtp.starttls.required=true

## **Uso**
Para enviar um email, faça uma requisição POST para o endpoint /email/enviar com os seguintes parâmetros:

    para: Endereço de email do destinatário.
    assunto: Assunto do email.
    mensagem: Conteúdo do email
    
## **Endpoints**

    POST /email/enviar: Envia um email com os detalhes especificados na requisição.

## **Tecnologias Utilizadas**

    Java: Linguagem de programação principal.
    Spring Boot: Framework para desenvolvimento do backend.
    Spring Boot Starter Mail: Starter para envio de emails.
    Maven: Gerenciador de dependências e automação de build.

## **Contribuição**
Contribuições são bem-vindas! Sinta-se à vontade para abrir um issue ou enviar um pull request.
