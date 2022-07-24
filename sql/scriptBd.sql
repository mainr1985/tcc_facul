/*Criação do BD*/
create database petfree1;

/*Conectando com o BD*/
\c petfree1;

/**
    CRIAÇÃO DAS TABELAS
**/

/*Tabela Funcionario*/
CREATE TABLE IF NOT EXISTS funcionario
(
    idfuncionario serial NOT NULL,
    cpf integer NOT NULL,
    rg integer NOT NULL,
    nome character varying(50),
    endereco character varying(50),
    complemento character varying(40),
    cidade character varying(40),
    cargo character varying(30),
    nomeusuario character varying(20),
    senha character varying(10),
    permissao character varying(30),
    email character varying(30),
    dtnascimento date,
    dtadmissao date,
    dtdemissao date,
    CONSTRAINT funcionario_pkey PRIMARY KEY (idfuncionario),
    CONSTRAINT funcionario_cpf_key UNIQUE (cpf)
)

/*Tabela Veterinário*/
create table IF NOT EXISTS veterinario (crmv numeric not null primary key, 
			  id_funcionario numeric not null,
                          especialidade varchar(50) not null);

/*Tabela Tutor*/
create table IF NOT EXISTS tutor (codtutor serial not null primary key, cpf numeric not null, rg numeric not null,
                    nome varchar(50) not null, endereco varchar(50) not null, numero numeric not null,
                    complemento varchar(30), bairro varchar(50) not null, cidade varchar(50) not null,
                    cargo varchar(30) not null, dtcadastro Date not null, telefone numeric,
                    celular numeric, email varchar(50) not null);

/*Tabela Paciente*/
CREATE TABLE IF NOT EXISTS paciente
(
    codpaciente serial NOT NULL,
    nome character varying NOT NULL,
    raca character varying NOT NULL,
    idade numeric,
    peso numeric,
    codtutor integer NOT NULL,
    CONSTRAINT paciente_pkey PRIMARY KEY (codpaciente),
    CONSTRAINT fk_codtutor FOREIGN KEY (codtutor) REFERENCES tutor (codtutor) 
)

/*Tabela Paciente_Tutor*/
CREATE TABLE IF NOT EXISTS paciente_tutor
(
    codpaciente integer NOT NULL,
    codtutor integer NOT NULL,
    CONSTRAINT pk_paciente_tutor PRIMARY KEY (codpaciente, codtutor),
    CONSTRAINT fk_codpaciente FOREIGN KEY (codpaciente) REFERENCES public.paciente (codpaciente) ,
    CONSTRAINT fk_codtutor FOREIGN KEY (codtutor) REFERENCES public.tutor (codtutor)        
)

/*Tabela Prontuário_Veterinário*/
create table IF NOT EXISTS prontuario_veterinario (codprontuario numeric not null, idveterinario numeric not null,
                                      primary key (codprontuario, idveterinario),
                                      foreign key (codprontuario) references prontuario (codprontuario),
                                      foreign key (idveterinario) references veterinario (crmv));

/*Tabela Prontuário*/
create table IF NOT EXISTS prontuario (codprontuario serial not null primary key, 
			 codpaciente integer not null, 
			 crmv integer not null, 
			 codconsulta integer not null, 
			 codtratamento integer not null);

alter table prontuario add constraint fk_paciente foreign key (codpaciente) references paciente(codpaciente);
alter table prontuario add constraint fk_veterinario foreign key (crmv) references veterinario (crmv);
alter table prontuario add constraint fk_consulta foreign key (codconsulta) references consulta (idconsulta);


/*Tabela Exames*/
create table IF NOT EXISTS exames ( codexame serial not null primary key, 
		      nome varchar(40) not null, 
		      indicacao varchar(40) not null, 
		      crmv integer not null, 
		      codpaciente integer not null);

alter table exames add constraint fk_paciente foreign key (codpaciente) references paciente(codpaciente);
alter table exames add constraint fk_veterinario foreign key (crmv) references veterinario (crmv);

/*Tabela Fornecedor*/
create table IF NOT EXISTS fornecedor (cpf_cnpj integer not null primary key, 	
			 tipo_pessoa tipopessoa not null, 
			 nomefantasia varchar(50) not null, 
			 endereco varchar(50) not null, 
			 numero integer not null, 
			 complemento varchar(30), 
			 telefone integer not null, 
			 email varchar(40) not null);


/*Tabela Produto*/
CREATE TABLE IF NOT EXISTS PRODUTO (CODPRODUTO SERIAL NOT NULL PRIMARY KEY, 
				    NOME VARCHAR(40) NOT NULL, 
				    DESCRICAO VARCHAR(40) NOT NULL, 
				    CATEGORIA PRODUTOTIPO NOT NULL);

/*Tabela Fornecedor_Produto*/
create table fornecedor_produto (codproduto integer not null, 
                                 idfornecedor integer not null, 
                                 primary key (codproduto, codfornecedor), 
                                 foreign key (codproduto) references produto (codproduto), 
                                 foreign key (idfornecedor) references fornecedor (cpf_cnpj)
                                );

/*Tabela Consulta*/
CREATE TABLE IF NOT EXISTS consulta
(
    idconsulta integer NOT NULL DEFAULT nextval('consulta_idconsulta_seq'::regclass),
    codpaciente integer NOT NULL,
    codtutor integer NOT NULL,
    idveterinario integer NOT NULL,
    CONSTRAINT consulta_pkey PRIMARY KEY (idconsulta),
    CONSTRAINT fk_codpaciente FOREIGN KEY (codpaciente) REFERENCES paciente (codpaciente), 
    CONSTRAINT fk_codtutor FOREIGN KEY (codtutor) REFERENCES tutor (codtutor),
    CONSTRAINT fk_idveterinario FOREIGN KEY (idveterinario) REFERENCES veterinario (crmv) 
)

