let phrase = prompt("Escribe una frase");

let splitPhrase = phrase.split(' ');
let solution= [];
 
for(i=0; i<splitPhrase.length;i++){

  let newSplitPhrase = splitPhrase[i].charAt(0).toUpperCase() + splitPhrase[i].slice(1);
  solution[i] = newSplitPhrase; 
} 

console.log(solution.join(" "));