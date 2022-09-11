# La consola de MySQL.
Para conectarse a la base de datos:
mysql -u root -h localhost -p

(el -u es: ¿cual es el usuario?)
(-h: el host, en que servidor puede ser (IP o dominio) esta la base de datos. se puede escribir localhost o también 127.0.0.1, que es lo mismo )
(-p: es la password)

Si el anterior código no funciona es porque se debe declarar el PATH (que es la ubicación de instalacion de MySQL) en las variables de entorno de Windows.

Todos los comandos deben terminar en punto y coma (;) a excepción de dos.

- show databases ;
- use NombreDataBase;  // selecciona la base de datos.
- show tables;  //Muestra las tablas de la database seleccionada.
- select database(); //muestra la base de datos que tengo seleccionada.
