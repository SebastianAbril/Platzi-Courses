# Tipos de columnas / creacion de la tabla books.

- CREATE database platzi_operation; 
- CREATE DATABASE IF NOT EXISTS platzi_operation;

Si tiro el anterior comando aparentemente se creo, pero si después uso: - SHOW WARNINGS;  , me va a salir que no pudo crear la base de datos porque si existe.

-SHOW WARNINGS;

-CREATE DATABASE platzi_operation; // ME VA A SALIR ERROR.

-use platzi_operation;

En una liberia lo primero que se necesitan son libros:
- CREATE TABLE books ();
- CREATE TABLE IF NOT EXITS books (
    book_id INTEGER PRIMARY AUTO_INCREMENT,
    author ,
    title VARCHAR(100) NOT NULL,
    year INTEGER UNSIGNED NOT NULL DEFAULT 1900
    language VARCHAR(2) NOT NULL DEFAULT 'es' COMMENT 'ISO 639-1 Language', cover_url VARCHAR(500),
    price DOUBLE(6,2) NOT NULL DEFAULT 10.0,
    sellable TINYINT(1) DEFAULT 1,
    copies INTEGER NOT NULL DEFAULT 1,
    description TEXT
);

Toda tupla necesita un ID, es obligatorio. Se necesita una manera universal de referirse a una tupla.
RECOMENDACION: las imagenes no se guardan en la base de datos.

