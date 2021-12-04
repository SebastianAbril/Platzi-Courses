let phrase = prompt("Escribe una frase");
let count = 0;
for(let i of phrase){
  if(i === 'a'){
    count++;
  }
}
console.log(`La frase tiene ${count} caracteres "a"`)