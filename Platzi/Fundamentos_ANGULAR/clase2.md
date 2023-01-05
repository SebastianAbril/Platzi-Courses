# clase 2

- Verifica versión de Node: node -v

- Verifica versión de npm: npm -v

- Instala el CLI de Angular: npm i -g @angular/cli

- Verifica tu instalación: ng version

- Crea tu primer proyecto: ng new my-project

- Ejecuta el servidor de desarrollo: ng serve Dentro de la carpeta de tu proyecto

# clase 4

— src
Aqui se encuentra el corazón del proyecto, están los componentes, htm, css, etc.

— .browserslistrc
Indica a angular en que versiones de navegadores tiene que ser compatible tu aplicación.

— .editorconfig
Tiene que ver con el trabajo en el equipo, ver el mismo espacio de identación, etc.
Para que este archivo funcione se debe tener un plugin en el VSCode: EditorConfig for VS Code

— tsconfig.json
Tiene que ver con la configuración de angular con tipescript.
Este archivo nos dice como va a compilar, hacia donde va a transpilar los archivos, que versión vamos a utilizar de JavaScript, ver algunos compiladores de angular.

— angular.json
Aqui podemos manejar diferentes ambientes, como por ejemplo para realizar pruebas(tester), también para algunas configuraciones de compilación de angular.

— karma.conf.js
Configuración para correr pruebas unitarias.

— .nvmrc
Este archivo debemos agregarlo, indica cual es la versión de node recomendada para correr el proyecto.

PLUGIN+:
-> Angular Language Service
-> Ayuda que la experiencia con angular sea increible.