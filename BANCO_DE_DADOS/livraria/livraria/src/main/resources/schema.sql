drop table if exists livraria;

CREATE TABLE livraria (
     id_livraria BIGINT AUTO_INCREMENT NOT NULL,
    autor VARCHAR(255) NULL,
    nome VARCHAR(255) NULL,
    ano INT NULL,
    valor DOUBLE NULL,
     PRIMARY KEY (id_livraria));