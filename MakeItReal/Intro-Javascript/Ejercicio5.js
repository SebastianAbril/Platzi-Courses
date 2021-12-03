let weight = parseFloat(prompt("Escribe tu peso en kg"));
let height = parseFloat(prompt("Escribe tu altura en metros"));

let BMI = weight/ Math.pow(height,2);

console.log("Tu BMI es "+BMI);