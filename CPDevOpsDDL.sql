Drop table Carro cascade constraints;

CREATE TABLE Carro (
codigo number(5) PRIMARY KEY,
nome varchar2(15) NOT NULL,
dt_fabricacao DATE NOT NULL,
modelo varchar2(20) not null
);

INSERT INTO Carro (codigo, nome, dt_fabricacao, modelo) VALUES (10, 'Fiat', '10-04-2002', 'Palio');

CREATE TABLE Modelo (
codigo number(5) PRIMARY KEY,
nome varchar2(15) NOT NULL,
data DATE NOT NULL
);

INSERT INTO Modelo (codigo, nome, data) VALUES (10, 'Palio', '12-05-2002');