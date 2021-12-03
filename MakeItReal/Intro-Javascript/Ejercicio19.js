let userNumber = parseInt(prompt("Escribe un número"));
let list = [];

for(i=1; i<=userNumber; i++){
  list.push(i);
}
list.splice(1,1);

for(let i of list){
  console.log(i);
}