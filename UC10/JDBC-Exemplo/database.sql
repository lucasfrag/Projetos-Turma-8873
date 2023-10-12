DROP DATABASE IF EXISTS livraria_8873;
CREATE DATABASE livraria_8873;
USE livraria_8873;

CREATE TABLE livro (
	id INT PRIMARY KEY AUTO_INCREMENT,
    titulo varchar(150),
    autor varchar(100),
    editora varchar(100),
    lido boolean,
    dataPublicacao Date
);

SELECT * FROM livro;