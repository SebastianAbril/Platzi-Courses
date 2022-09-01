//console.info('Algo');
//console.warn("Cuidado");

var tabla = [
    {a:1,
    b: "Z"},
    {
    a:2,
    b:"Otra"
    }
]
//console.log(tabla);
//console.table(tabla);
/* console.group("Conversacion");
console.log("Hola, cómo estas?")
console.log("Muy bien, estoy a punto de comenzar mi trabajo")
console.log("Esas son excelentes noticias!")
console.groupEnd("Conversacion")
console.log("Esto ya es otro cuento aparte") */

function function1(){
    console.group('funcion 1');
    console.log("Esto es de la funcion 1");
    console.log("Esto tambien es de la funcion 1");
    function2();
    console.groupEnd('funcion 1');
}

function function2(){
    console.group('funcion 2');
    console.log("Ahora estamos en la funcion 2")
    console.groupEnd('funcion 2');
}

function1();

console.count("veces");
console.count("veces");
console.count("veces");
console.count("veces");
console.countReset("veces");
console.count("veces");
console.count("veces");
console.count("veces");