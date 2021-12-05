let phrase = prompt("Ingrese una frase: ");
let splitPhrase = phrase.split(" ");

for(i=0 ; i<splitPhrase.length ; i++){
  let word = splitPhrase[i];
  console.log(word);
}
