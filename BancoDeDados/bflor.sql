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

