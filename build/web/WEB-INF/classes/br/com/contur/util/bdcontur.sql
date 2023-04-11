/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Alunos
 * Created: 7 de jun de 2022
 */
CREATE TABLE Usuario (
id_usuario serial PRIMARY KEY,
senha_usuario VARCHAR (15) not null,
email_usuario VARCHAR (50) not null,
nome_usuario VARCHAR (50) not null
);



CREATE TABLE Avaliacao (
id_avaliacao serial PRIMARY KEY,
nota_avaliacao integer not null,
data_hora_avaliacao timestamp,
comentario text,
fk_Usuario_id_usuario Int,
fk_Ponto_Turistico_id_ponto_turistico Int
);



CREATE TABLE Ponto_Turistico (
id_ponto_turistico serial PRIMARY KEY,
nome_ponto_turistico VARCHAR (20) not null,
dados_ponto_turistico text not null,
descricao_ponto_turistico text not null,
fk_Cidade_id_cidade Int
);



CREATE TABLE Cidade (
id_cidade serial PRIMARY KEY,
uf_cidade VARCHAR (20),
nome_cidade VARCHAR (20)not null
);



CREATE TABLE Parceiro (
id_parceiro serial PRIMARY KEY,
logo_parceiro VARCHAR,
nome_parceiro VARCHAR (20) not null,
descricao_parceiro text not null,
telefone_parceiro VARCHAR (15),
fk_Cidade_id_cidade Int
);



CREATE TABLE Noticia (
id_noticia serial PRIMARY KEY,
titulo_noticia VARCHAR (20) not null,
data_noticia timestamp,
subtitulo_noticia VARCHAR(100) not null,
foto_noticia VARCHAR,
conteudo_noticia text,
fk_Cidade_id_cidade Int
);



CREATE TABLE Evento (
id_evento serial PRIMARY KEY,
data_evento timestamp not null,
nome_evento VARCHAR (20),
local_evento VARCHAR (20),
hora_evento VARCHAR (10),
descricao_evento text,
fk_Cidade_id_cidade Int,
fk_Tipo_Evento_id_evento Int,
fk_Portal_Transparencia_id_documento Int
);



CREATE TABLE Tipo_Evento (
id_evento serial PRIMARY KEY,
nome_tipo_evento VARCHAR (20)
);



CREATE TABLE Portal_Transparencia (
atracao VARCHAR (20),
valor_gasto DECIMAL (7, 2),
id_documento Int PRIMARY KEY,
id_evento Int
);

ALTER TABLE Avaliacao ADD CONSTRAINT FK_Avaliacao_2
FOREIGN KEY (fk_Usuario_id_usuario)
REFERENCES Usuario (id_usuario)
ON DELETE RESTRICT;

ALTER TABLE Avaliacao ADD CONSTRAINT FK_Avaliacao_3
FOREIGN KEY (fk_Ponto_Turistico_id_ponto_turistico)
REFERENCES Ponto_Turistico (id_ponto_turistico)
ON DELETE RESTRICT;

ALTER TABLE Ponto_Turistico ADD CONSTRAINT FK_Ponto_Turistico_2
FOREIGN KEY (fk_Cidade_id_cidade)
REFERENCES Cidade (id_cidade)
ON DELETE RESTRICT;

ALTER TABLE Parceiro ADD CONSTRAINT FK_Parceiro_2
FOREIGN KEY (fk_Cidade_id_cidade)
REFERENCES Cidade (id_cidade)
ON DELETE RESTRICT;

ALTER TABLE Noticia ADD CONSTRAINT FK_Noticia_2
FOREIGN KEY (fk_Cidade_id_cidade)
REFERENCES Cidade (id_cidade)
ON DELETE RESTRICT;

ALTER TABLE Evento ADD CONSTRAINT FK_Evento_2
FOREIGN KEY (fk_Cidade_id_cidade)
REFERENCES Cidade (id_cidade)
ON DELETE RESTRICT;

ALTER TABLE Evento ADD CONSTRAINT FK_Evento_3
FOREIGN KEY (fk_Tipo_Evento_id_evento)
REFERENCES Tipo_Evento (id_evento)
ON DELETE RESTRICT;

ALTER TABLE Evento ADD CONSTRAINT FK_Evento_4
FOREIGN KEY (fk_Portal_Transparencia_id_documento)
REFERENCES Portal_Transparencia (id_documento)
ON DELETE RESTRICT;

