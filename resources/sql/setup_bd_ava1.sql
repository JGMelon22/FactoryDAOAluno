CREATE DATABASE IF NOT EXISTS bd_ava1;
USE bd_ava1;  -- Selecione o banco de dados

-- Criação da tabela 'aluno'
CREATE TABLE IF NOT EXISTS aluno
(
	idaluno INT AUTO_INCREMENT,
	matricula INT UNIQUE NOT NULL,
	nome VARCHAR(100) NOT NULL,
	CONSTRAINT pk_aluno PRIMARY KEY (idaluno)
);

CREATE INDEX idx_idaluno_aluno
ON aluno(idaluno);

-- Populando com dados para teste
INSERT INTO aluno (matricula, nome)
VALUES (12345, 'João Silva'),
	   (67890, 'Maria Oliveira'),
       (11223, 'Carlos Souza');