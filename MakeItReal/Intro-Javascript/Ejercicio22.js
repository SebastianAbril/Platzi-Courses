const nums = [1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1]
let contador = 0;
for(let i of nums){
  if(i===1){
    contador++;
  }
}

console.log(`${contador}`)