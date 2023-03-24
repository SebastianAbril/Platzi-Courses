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
