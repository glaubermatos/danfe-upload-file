<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/glaubermatos/upload-danfe-file?color=%2304D361&style=flat">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/glaubermatos/upload-danfe-file?style=flat">
  
  <a href="https://github.com/glaubermatos/jobscalc/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/glaubermatos/upload-danfe-file?style=flat">
  </a>
    
   <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen?style=flat">
  
</p>

<h2 align="center">
    Aplicação para upload e processamento de arquivos xml de Notas Fiscais
</h2>


<h4 align="center"> 
	🚧  Aplicação em desenvolvimento! 🚧
</h4>

## 🏁 Tópicos

<p>
 👉<a href="#-sobre-o-projeto" style="text-decoration: none; "> Sobre</a> <br/>
👉<a href="#-funcionalidades" style="text-decoration: none; "> Funcionalidades</a> <br/>
👉<a href="#-como-executar-o-projeto" style="text-decoration: none"> Como executar</a> <br/>
👉<a href="#-tecnologias" style="text-decoration: none"> Tecnologias</a> <br/>
👉<a href="#-autor" style="text-decoration: none"> Autor</a> <br/>
👉<a href="#-user-content--licença" style="text-decoration: none"> Licença</a>

</p>

## 💻 Sobre o projeto

A aplicação tem como principal objetivo permitir o upload de Nota Fiscal, realizar a leitura do xml, fazer o bind com a estrutura de classes do domínioe persistir em um banco de dados MySQL.

A proposta do projeto é ser desenvolvido seguindo modelo arquitetural de microservices onde terá 3 aplicações:

- **nfe-upload-service**: Aplicação responsável por recepcionar os arquivos;
- **nfe-process-service**: Aplicação responsável por processar os arquivos;
- **nfe-front-service**: aplicação responsável por apresentar a interface com o usuário.

### Diagrama de classes

<br />

<img src=".github/assets/class-diagram.png" width="800px" />

<br />

### Protótipo

<br />

<img src=".github/assets/prototipo-upload-nota-fiscal.png" width="800px" />

<br />

---

<a name="-funcionalidades"></a>

## ⚙️ Funcionalidades

<br />

- ### **nfe-upload-service**
    - O nfe-upload-service deverá expor um serviço para realizar o upload do arquivo .xml referente a nota fiscal eletrônica.
    - Após recepcionar o arquivo, o nfe-upload-service deverá gravar o arquivo em disco no diretório input e retornar uma mensagem para o cliente informando que o seu arquivo foi recepcionado com sucesso e que será processado.
    - Quando o arquivo for enviado via upload, a nota deverá conter o status de AGUARDANDO_PROCESSAMENTO

<br />

- ### **nfe-process-service**
    - O nfe-process-service, será executado a cada 120 segundos, ler o diretório input e processar os arquivos, se o arquivo foi processado com sucesso mover para a pasta output. Se o arquivo for processado com falha mover o arquivo em processamento para o diretório error.
    - Quando o nfs-process-service for executado a nota deverá ter o status de EM_PROCESSAMENTO, se a nota foi processada com SUCESSO, o status deverá ser PROCESSADA. Se a nota foi processada com erro a nota deverá ter o status PROCESSADA_COM_ERRO.

<br />

- ### **nfe-front-service**
    - O nfe-front-service deverá ser uma aplicação web simples (desejável utilizar um framework JS)
    - Deve listar as notas fiscais já enviadas em um componente de tabela
    - Ao clicar no botão Upload - Abrir a tela para realizar o upload do arquivo
    - Ao clicar no botão Duplicatas - Abrir formulário para detalhar as duplicatas da Nfe, conforme modelo apresentado no diagrama de classes
    - Ao clicar no botão Remover - Abrir formulário para confirmar se deseja excluir o item selecionado.

    <br />


---

## 🚀 Como executar o projeto

<br />

```bash

# Em breve...

```

<br />

---

<br />

## 🛠 Tecnologias

Em breve...

<br />

---

<br />

<a name="-autor"></a>

## 🦸‍♂️ **Autor**

<br />

<p>
 <img src="https://avatars.githubusercontent.com/u/10993285?v=4" width="150px;" alt="glaubermatos"/>
 <br />
 <sub><strong>🌟 Glauber de Oliveira Matos 🌟</strong></sub>
</p>

[![Linkedin Badge](https://img.shields.io/badge/-linkedin-blue?style=flat&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/glaubermatos/)](https://www.linkedin.com/in/glaubermatos/)

---
<a name="-user-content--licença"></a>

## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

Feito com :satisfied: por Glauber de Oliveira Matos 👋🏽 [Entre em contato!](https://www.linkedin.com/in/glaubermatos/)
