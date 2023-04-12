package com.sebas;

public class Notas {
}

/*
* ¿Qué es un objeto?
* Es una instancia de la clase, representa cosas. Pueden ser simples o complejos, reales o imaginarios.
*
* Por ejemplo: podemos instanciar un objeto de marca Sony modelo Bravia y otro objeto marca Samsung y modelo
* Crystal UHD.
*
* // Primer objeto de la clase Televisor
* Televisor sony = new Televisor(); // se instancia a través de la palabra reservada new
* sony.nombreDelMetodo();
*
* //Segundo objeto de la clase Televisor
* Televisor samsung = new Televisor();
* samsumg.nombreDelMetodo();
*
* */

/*
* ¿QUE ES UNA CLASE?
*
* Es una definición de un objeto
* Conjunto declarativo de atributos y metodos
*
* Por ejemplo: una clase televisor puede tener atributos tales como marca y modelo y métodos como encender, apagar y cambiar de canal.
*
* [Modificador de acceso] class NombreClase{
*   // Declaración de atributos o campos
*   // Declaración de métodos
* }
* */

/*
*    ¿QUÉ ES MAVEN?
*     es un Bill Tools y ademas es un Project Management:
*    - Gestor de dependencias
*    - Estructura standard de proyecto (Archetypes)
*    - Plugins orientados a proyectos
*    - Soporte para fases del proyecto (Lifecycle)
*    - Documentación de proyecto
*    - Soporte para gestión avanzada de proyecto
*
*     ¿ COMO SE INSTALA?
*       Ya viene incluido en le IDE de IntelliJ
*
*      CICLO DE VIDA MAVEN
*      Es el concepto fundamental para trabajar con mavenm.
*      - Proceso por el cual podremos construir y distrbuir una artefacto, proyecto.
*      - Esta compuesto por varias fases (comandos):
*
*           - 1.Clean (mvn clean): limpia el espacio de trabajo que utiliza Maven, por lo general carpeta target, del directorio raíz de nuestro proyecto .
*           - 2.Validate (mvn clean): Solamente valida que el proyecto dispone de toda la información necesaria para ser procesado. Muy rara vez suele utilizarse.
*           - 3.Compile (mvn compile): Se encarga de compilar nuestro proyecto, es decir archivos.java y generar en carpetas de destinos los compilados.
*           - 4.Test (mvn test): AL finalizar la compilación, se ejecutan las pruebas unitarias que se hah construido. Con el fin de validar que nuestro código es correcto.
*           - 5.Package (mvn package): Se encarga de empaquetar nuestros fuentes en un formato estándar de Java, permitiendo su ejecución o despliegue en servidores.
*           - Verify (mvn verify): Se encarga de ejecutar los test de integración para confirmar que todo funciona correctamente y que la calidad es la correcta.
*           - Install (mvn install): Se encarga de desplegar el artefacto en el repositorio local con su correspondiente versión.
*           - Site (mvn site): Se encarga de generar el sitio de documentación de nuestro proyecto.
*           - Deploy (mvn deploy): Similar a Install, con la diferencia que el artefacto se aloja en un repositorio remoto.
*
* */

/*
*   JAVA PERSISTENCE API (JPA), es un estándar para la persistencia de objetos en base de datos relacionales.
* Nos permite realizar operaciones básicas (CRUD), sin la necesidad de escribir cada sentencia SQL.
*
* CONCEPTOS BÁSICOS:
*
* - Persistence.xml: archivo que contiene la información necesaria para conectarnos a nuestra base de datos y define el conjunto de entidades a gestionar.
* - EntityManagerFactory: es conocido como PersistenceUnit o Unidad de Persistencia. Es único y es con el que gestionamos todas las entidades.
*
* - EntityManager: es creado por el EntityManagerFactory y gestiona un conjunto de entidades u objetos. El EntityManager es el encargado de guardar, eliminar los ojetos de la base de datos.
* - PersistenceContext: hace referencia a los objetos que han sido manipulados por el EntityManager y se encuentran bajo su control, una vez que se hayan invocado a los metodos persist,merge,ect del EntityManager.
*
*
*
*  ¿QUE ES ORM?
*
*   Object Relational Mapping, lo que nos permite es poder mapear nuestros objetos a entidades en nuestra base de datos relacional.
*   En donde las clases representan las tablas y los atributos de estas clases representan a los campos de las tablas.
*
* ¿ QUÉ ES UN FRAMEWORK?
*
* Es una construcción de Software que nos provee una solución para una problemática determinada, para este caso el manejo con la base de datos.
* Los framework nos facilita enormemente el proceso de desarrollo de nuestras aplicaciones ya que no debemos de poner foco en como resolver ciertas problemáticas que se nos presenta.
*
* ¿ QUÉ ES HIBERNATE?
*
* Es un framework de persistencia y acceso de datos que se encuentren alojados en una base de datos. Se encuentra basado en el estándar de Java, conocido como JPA.
*
* Ventajas de usar Hibernate:
* - No tenemos que preocuparnos por el control de datos, por ejemplo valores nulos.
* - No tenemos que preocuparnos cual es el motor de base de datos a utilizar, nos abstrae del mismo.
* - No tenemos que estar preocupándonos si modificamos alguna entidad, aplica los cambios solo.
* - Nos evita el mapeo de datos a través del setString, setInt,etc que utilizamos al usar el API de JDBC.
* */
