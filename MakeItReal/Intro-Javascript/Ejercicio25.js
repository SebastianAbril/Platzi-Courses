let phrase = prompt("Escribe una frase");

function convert(x){
  x = x.toLowerCase().replaceAll(' ','').replaceAll('a','4').replaceAll('e','3').replaceAll('i','1').replaceAll('o','0');
  return x;
}
console.log(convert(phrase));