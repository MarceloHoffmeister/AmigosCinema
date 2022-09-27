DROP TABLE IF EXISTS Amigos;
DROP TABLE IF EXISTS FilmesCompanhiasCinematrográficas;
DROP TABLE IF EXISTS FilmesProvedorasStreaming;
DROP TABLE IF EXISTS Filmes;
DROP TABLE IF EXISTS Avaliações;

CREATE TABLE Amigos(
    Nome VARCHAR(50)NOT NULL PRIMARY KEY,
    Apelido VARCHAR(30),
    Sexo VARCHAR(1) NOT NULL,
    EstadoCivil INT NOT NULL,
    Cidade VARCHAR(50)NOT NULL,
    Email VARCHAR(50)NOT NULL,
    Whatsapp VARCHAR(30),
    Instagram VARCHAR(30)
);

CREATE TABLE Filmes(
    Sequencial INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Título VARCHAR(60) NOT NULL,
    Gênero INT NOT NULL,
    Ano INT NOT NULL
);

CREATE TABLE FilmesCompanhiaCinematrográficas(
    OscarMelhorFilme BOOLEAN NOT NULL,
    OscarMelhorDiretor VARCHAR(30),
    OscarMelhorAtor VARCHAR(30),
    OscarMelhorAtriz VARCHAR(30),
    FilmeId INT NOT NULL,
    FOREIGN KEY (FilmeId) REFERENCES Filmes(Sequencial)
);

CREATE TABLE FilmesProvedorasStreaming(
    ProvedoraStreaming INT NOT NULL,
    Produção INT NOT NULL,
    TotalEpisódios INT NOT NULL,
    FilmeId INT NOT NULL,
    FOREING KEY (FilmeId) REFERENCES Filmes(Sequencial)
);

CREATE TABLE Avaliações(
    Sequencial INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    AmigoId VARCHAR(50) NOT NULL,
    FilmeId INT NOT NULL,
    ClassificacãoTrama INT NOT NULL,
    ClassificaçãoDireção INT NOT NULL,
    ClassificaçãoAtuação INT NOT NULL,
    PreferênciaAtuação INT NOT NULL,
    Preferência INT,
    DataHora TIMESTAMP NOT NULL,
    FOREIGN KEY (AmigoId) REFERENCES Amigos(Nome),
    FOREIGN KEY (FilmeId) REFERENCES Filmes(Sequencial)
);