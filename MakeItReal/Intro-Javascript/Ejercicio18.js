nombres = ["Pedro", "Pablo", "María", "Juan", "Diana"];
console.log(nombres);

let userName = prompt("Ingrese un nuevo nombre");
nombres.push(userName);
let secondName = prompt("Ingrese otro nuevo nombre");
nombres[2] = secondName;

for (let i of nombres){
  console.log(i);
}