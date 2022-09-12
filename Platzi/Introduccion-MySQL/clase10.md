DE LA CLASE 9 SE TIENE:

- CREATE TABLE IF NOT EXISTS books (
    book_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    author_id INTEGER UNSIGNED ,
    title VARCHAR(100) NOT NULL,
    year INTEGER UNSIGNED NOT NULL DEFAULT 1900,
    language VARCHAR(2) NOT NULL DEFAULT 'es' COMMENT 'ISO 639-1 Language', 
    cover_url VARCHAR(500),
    price DOUBLE(6,2) NOT NULL DEFAULT 10.0,
    sellable TINYINT(1) DEFAULT 1,
    copies INTEGER NOT NULL DEFAULT 1,
    description TEXT
);



/* AQUI COMIENZA LA CLASE 10*/

# CLASE 10. Tipos de columnas / Creación de la tabla authors

mySQL permite mayusculas y minusculas, osea no es case sensitive.
Sin embargo es buena idea que las palabras reservadas de MySQL sean en mayusculas y los nombres de las tablas y demas cosas en minusculas.

- CREATE TABLE IF NOT EXISTS authors(
    author_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    nationality VARCHAR(3)
);

- SELECT * from authors;
- SELECT * from books;

OJO CON EL COMANDO DROP, CUANDO SE BORRA NO HAY MANERA DE RECUPERAR LA INFO:
- drop table authors

- describe authors;

- show full columns from books;

con las comillas francesas `` puedo usarlas para reservar las palabras de mis columnas por ejemplo `ìnteger`.