const min = 1;
const max = 10;
let surpriseNumber = Math.floor( Math.random()*(max+1-min)+min);

let userNumber = parseInt(prompt("Adivina el número del 1 al 10")); 

if( userNumber === surpriseNumber){
  console.log("Felicitaciones, ese era!");
}
else{
console.log("Lo siento, intenta nuevamente!");
}