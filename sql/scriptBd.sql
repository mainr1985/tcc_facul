
/**
 * Author:  Maíra
 * Created: 15/04/2022

script de criação do banco de dados PetFree
 */

create database petfree;
CREATE TABLE funcionario
(
  id_funcionario serial NOT NULL,
  identidade varchar(12) NOT NULL,
  cpf varchar(14) NOT NULL,
  nome varchar(50) NOT NULL,
  endereco varchar(50) NOT NULL,
  complemento varchar(60) NOT NULL,
  telefone varchar(30) NOT NULL,
  cargo varchar(30) NOT NULL,
  obs varchar(2000),
  dt_nasc date NOT NULL,
  dt_adm date NOT NULL,
  nome_usuario varchar(10),
  senha varchar(10),
  permissao varchar(15),
  CONSTRAINT id_funcionario PRIMARY KEY (id_funcionario),
  CONSTRAINT cpf UNIQUE (cpf)
);

create table veterinario(
  crmv varchar(30) NOT NULL,
  especialidade varchar(30) NOT NULL,
  id_funcionario integer NOT NULL,
  CONSTRAINT id_veterinario PRIMARY KEY (crmv),
  CONSTRAINT id_funcionario FOREIGN KEY (id_funcionario)
      REFERENCES funcionario (id_funcionario) 
);