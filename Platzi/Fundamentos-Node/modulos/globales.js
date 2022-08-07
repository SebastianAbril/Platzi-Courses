/* let i = 0;
let intervalo = setInterval(function(){
    console.log('Hola')
    if(i === 3){
        console.log("aqui termina el proceso")
        clearInterval(intervalo);
    }
    i++;
}, 1000);

setImmediate(function(){
    console.log("Holaaaaa");
})

console.log(__dirname); */

// Si no tengo que usar variables globales no usarlas, pues son un foco de problemas
global.miVariable = 'elValor';
console.log(miVariable);

