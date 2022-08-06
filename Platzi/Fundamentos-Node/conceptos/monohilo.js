console.log('Hola mundo');
let i = 0;

// setInterval ME CREA UN LOOP INFINITO.
setInterval( function(){
    console.log(i);
    i++;

    if (i === 5){
        console.log("Forzamos un error");
        var a = 3 + z;
    }
}, 1000);

console.log('Segunda instruccion');

// SI SE EJECUTA UN ERROR VA A PARAR POR COMPLETO EL PROCESO