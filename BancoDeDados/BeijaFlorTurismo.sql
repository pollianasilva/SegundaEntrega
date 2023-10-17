CREATE DATABASE IF NOT EXISTS beijaFlorTurismo;
USE beijaFlorTurismo;

CREATE TABLE IF NOT EXISTS usuario (
    idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    Login VARCHAR(50) NOT NULL,
    Senha VARCHAR(15) NOT NULL,
    HistoricoViagens TEXT
);

CREATE TABLE IF NOT EXISTS cadastro (
    idCadastro INT AUTO_INCREMENT PRIMARY KEY,
    idUsuario INT,
    NomeCompleto TEXT NOT NULL,
    Email VARCHAR(50) NOT NULL,
    Endereco TEXT NOT NULL,
    CPF CHAR(11) NOT NULL,  
    Senha VARCHAR(15) NOT NULL
);

CREATE TABLE IF NOT EXISTS Promocao (
    idPromocao INT AUTO_INCREMENT PRIMARY KEY,
    DestinoViagem TEXT NOT NULL,
    Disponibilidade DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS Viagem (
    idViagem INT AUTO_INCREMENT PRIMARY KEY,
    idUsuario INT,
    DestinoViagem TEXT NOT NULL,
    Disponibilidade DATE NOT NULL,
    DataPartida DATE NOT NULL,
    DataRetorno DATE NOT NULL,
    ValorTotal DECIMAL(10, 2)
);