// HOISTING
 //Sucede en veriones de JS de ES6 hacia abajo

 var miNombre; // Se esta declarando una variable.
 miNombre = "Sebastian"; //Se esta inicializando la variable.

console.log(suNombre);
var suNombre = "Lina";

//HOISTING con funciones

holaMundo();

function holaMundo(){
    console.log("Hola "+elNombre);
}

var elNombre = "Juan";