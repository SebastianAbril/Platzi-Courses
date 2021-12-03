
const min = 1;
const max = 10;
const random = Math.floor(Math.random()*(max+1-min)+min);

console.log(random);
let numberUser = parseInt(prompt("Adivina un número entre el 1 y el 10"));

let status = 0;

while(status===0){
  if(numberUser === random){
    console.log("Excelente, adivinaste el número");
    status = 1;
  }
  else{
    console.log("Intentalo de nuevo");
    status = 0;
    numberUser = parseInt(prompt("Adivina otra vez"));
  }
}