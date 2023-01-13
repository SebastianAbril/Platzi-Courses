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

# clas3 6: String interpolation

String interpolation: La forma en la que desde la lógica de nuestro typeScript podemos pasar datos a renderizar a nuestro template(html). En otras palabras, con las {{ }} podemos usar typeScript en html.

# clase 7: Property binding

Es una forma de controlar dinamamicamente algunos atributos html para que estos sean renderizados apartir una string, variable o atributo de un objeto de la capa logica.

Solo funcionan en una direccion desde la capa logica (conponent.ts) al objeto destino (atributo html), a esto se le conoce como flujo de datos.

Debemos vincular los valores del componente a los atributos html, esto logramos encerrando el atributo html entre “square brakets”.

Los corchetes [ ] (square brakets) hacen que Angular evalúe el lado derecho de la asignación como una expresión dinámica. Sin los corchetes, Angular trata el lado derecho como un literal de cadena y establece la propiedad en ese valor estático.

  <button disabled="false"></button> // dato fijo como string
  <button [disabled]="btnDisabled"></button> //dato dinamico
A menudo, “interpolation” y “Property Binding” pueden lograr los mismos resultados. Los siguientes pares de enlaces hacen lo mismo.

  <p><img src="{{itemImageUrl}}"> is the <i>interpolated</i> image.</p>
  <p><img [src]="itemImageUrl"> is the <i>property bound</i> image.</p>
Utilice cualquiera de las formas cuando represente valores de datos como cadenas.

Es preferible el metodo de “interpolation” para facilitar la lectura.

Al establecer una propiedad de elemento en un valor de datos que no sea una cadena, debe usar “Property Binding”.

Se recomienda comprender los “Event binding” para entender el flujo de datos de la aplicacion y como este interactua con “interpolation” y “Property Binding”.

Conceptos extraídos de:
https://angular.io/guide/property-binding-best-practices
https://stackblitz.com/angular/xamvkonjydvn?file=src%2Fapp%2Fapp.component.ts
https://gustavodohara.com/blogangular/agregar-componente-una-pagina-modulo-angular/
https://angular.io/guide/event-binding

# clase 8: Event binding

Event Binding
El Event Binding le permite escuchar y responder a las acciones del usuario, como pulsaciones de teclas, movimientos del mouse, clics y toques (Atributos HTML y propiedades DOM).

Para vincular un elemento html a un evento, debemos indicar el nombre del evento entre paréntesis a la izquierda de un signo igual y el nombre de una funcion entre comillas a la derecha, recuerda indicar que se trata de una funcion con los parentecis “nameFunction()” .

  <button (click)="onSave()">Save</button>
Usar () en el template html es sinonimo de llamar “addEventListener()”

Podemos realizar eventos personalizados con “EventEmitter”

Podemos llamar multiples eventos de la siguiente forma

  <button (click)="clickEvent()" (mouseenter)="mouseEnterEvent()">Click Me</button>
Podemos determinar un objetivo de evento de la siguiente manera

  <button (click)="handleClick($event)">Save</button>
Se recomienda comprender el flujo de datos de la aplicacion y como este interactua con la misma, existen tres tipos de enlaces:

Enlace unidireccional [] para enlazar desde la capa logica (component.ts) a la vista (html).
Enlace unidireccional () para enlazar de la vista (html) a la capa logica (component.ts).
Enlace bidireccional [()] para enlazar una secuencia de vista bidireccional a la capa logica (component.ts).
Conceptos extraídos de:
https://angular.io/guide/event-binding
https://angular.io/api/core/EventEmitter
https://blog.bitsrc.io/event-binding-mechanism-in-angular-b38f0e46d2ed
https://medium.com/claritydesignsystem/four-ways-of-listening-to-dom-events-in-angular-part-1-event-binding-3ec7e9f51a1d
https://angular.io/guide/binding-syntax