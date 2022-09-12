# comando CREATE

En SQL hay muchísimos tipos de dato y subtipos de dato.
Para diseñar la base de datos existen dos principales tipos de tablas:

- InnoDB: Es una tabla de bases de datos más nueva y robusta, recuperable en caso de falla de disco duro pero es un poco más lenta.
- MyISAM: Es un tipo de tabla directa, sencilla, más rápida y las transacciones son completamente uno a uno

En la arquitectura hay dos tipos de tablas:
- Catálogo: crecerá en un orden lento, según las necesidades de la propia BD. (Listado de Usuarios, InnoDB).
- Operación: se enfocan a lectura, mayor acceso a disco duro. (Préstamos de libros, MyISAM)