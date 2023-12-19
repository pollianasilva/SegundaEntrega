# Projeto Agência de Viagens
[![Typing SVG](https://readme-typing-svg.herokuapp.com?font=Montserrat&size=30&pause=1000&color=FD8524&random=false&width=435&lines=Segunda+Entrega)](https://git.io/typing-svg)<br>
![RecodePro](https://img.shields.io/badge/RecodePro-fd8524?style=for-the-badge&logo=chipperci&logoColor=white)
<br>

## Instruções

1. **Configuração do Banco de Dados:**
   - Abra o MySQL e execute os seguintes comandos para criar o banco de dados e tabelas:

    ```sql
    CREATE DATABASE IF NOT EXISTS bflor;
    USE bflor;

    CREATE TABLE usuario (
        idUsuario INT AUTO_INCREMENT PRIMARY KEY,
        nome_completo VARCHAR(50) NOT NULL,
        cpf VARCHAR(11) NOT NULL,
        endereco VARCHAR(50) NOT NULL,
        email VARCHAR(50) NOT NULL,
        senha VARCHAR(50) NOT NULL
    );

    CREATE TABLE viagem (
        idViagem INT AUTO_INCREMENT PRIMARY KEY,
        idUsuario INT, 
        destino_viagem VARCHAR(50) NOT NULL,
        valor_passagem DECIMAL(10, 2),  
        valor_promocional DECIMAL(10, 2),
        promocao BOOLEAN,
        disponibilidade DATETIME,
        ida DATETIME,
        volta DATETIME,
        valor_total DECIMAL(10, 2),
        FOREIGN KEY (idUsuario) REFERENCES usuario (idUsuario)
    );
    ```

2. **Conexão ao Eclipse:**
   - Após configurar o banco de dados, abra o Eclipse.
   - Conecte seu projeto Java ao MySQL usando as configurações apropriadas.
   - Execute o programa no Eclipse para realizar operações CRUD no banco de dados.

3. **Executando o Programa:**
   - Certifique-se de ter configurado corretamente a conexão do projeto ao banco de dados.
   - Execute o programa no Eclipse para interagir com o banco de dados e realizar operações CRUD.

Siga estas instruções para configurar e executar o projeto com sucesso.

## Nessa entrega foram solicitados:
<STRONG>Modelagem de dados</STRONG>  
 
- Criar o modelo conceitual e lógico do banco de dados, usando uma ferramenta de modelagem de dados (BRmodelo) 
- Criar as relações e cardinalidades entre as tabelas do modelo do banco
- Criar o modelo físico (tabelas e relações) usando SQL
- Criar o modelo do sistema (Classes) em UML e Java 
 
<STRONG>Back-end</STRONG>  
 
- Usando os conceitos da orientação a objetos em Java, criar um projeto do tipo console da agencia de viagens, aplicando o CRUD (Create, Read, Update, Delete) para todas as tabelas de seu modelo de banco de dados 
- Para a atividade vamos usar classes Java, JDBC e MySql 
 

<STRONG>Front-end</STRONG> 

 
- Atualizar a versão anterior do site, refatorando se preciso as páginas: Home, Destino, Promoções, Contato e as demais de acordo com seu modelo de dados usando HTML, CSS Bootstrap. 
- Faça as formatações de acordo com a paleta de cores escolhida.

  DEPLOY: https://beijaflorturismoo.netlify.app/<br><br>

<STRONG> PARA O MODELO LÓGICO, CONCEITUAL E UML FORAM UTILIZADOS: </STRONG><BR><BR>
[![Lucidchart](https://img.shields.io/badge/Lucidchart-FFA500?style=for-the-badge&logo=lucidchart&logoColor=white)](https://www.lucidchart.com/) [![Br Modelo](https://img.shields.io/badge/Br%20Modelo-008000?style=for-the-badge)](https://www.example.com)
<div style="display: inline_block" align = "center">
 OUTRAS FERRAMENTAS:
 <img align="center" alt="Polly-VS" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg">  
<img align="center" alt="Polly-Html" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg">
<img align="center" alt="Polly-CSS" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg">
<img align="center" alt="Polly-bootstrap" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original.svg">  
<img align="center" alt="Polly-eclipse" height="30" width="40" src="https://skillicons.dev/icons?i=eclipse" /> 
<img align="center" alt="Polly-Mysql" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg">
 
</div> 

<br><br>
<div><a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.herokuapp.com?font=Montserrat&size=30&pause=1000&color=FD8524&random=false&width=435&lines=Sobre+o+RecodePro" alt="Typing SVG" /></a></div>

- O Recode Pro é um bootcamp dedicado à formação de programadores Full Stack.
-  Em 2023, contamos com mais de 15.000 inscritos, dos quais 420 foram selecionados para participar do programa.
-  Atualmente, temos aproximadamente 180 alunos.
<br> 
<div><a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.herokuapp.com?font=Montserrat&size=30&pause=1000&color=FD8524&random=false&width=435&lines=Desenvolvimento+Cont%C3%ADnuo" alt="Typing SVG" /></a></div>
<br>
Durante o curso, foram solicitados quatro trabalhos individuais à medida que nos familiarizávamos com as ferramentas.
 
- Disponíveis em:

| Primeira Entrega:| Segunda Entrega: | Terceira Entrega | Quarta Entrega | Última Entrega |
| --- | --- | --- | --- | --- |
| Entregue em: 05/08/23<br> https://github.com/pollianasilva/PrimeiraEntrega| Entregue em: 16/10/23<br> https://github.com/pollianasilva/SegundaEntrega | Entregue em: 03/11/23<br> https://github.com/pollianasilva/TerceiraEntrega | Entregue em: 13/12/23<br>https://github.com/pollianasilva/QuartaEntrega | Prevista para: 09/01/24<br>https://github.com/pollianasilva/UltimaEntrega | 
