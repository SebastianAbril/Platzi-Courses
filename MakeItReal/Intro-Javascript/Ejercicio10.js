const weight = parseFloat(prompt("Escribe tu peso en kg"));
const height = parseFloat(prompt("Escribe tu altura en metros"));

const BMI = weight/ Math.pow(height,2);
console.log(BMI);

if(BMI<18.5){
  console.log("Bajo de peso");
}
else if(BMI>=18.5 && BMI<=24.9){
  console.log("Normal");
}
else if(BMI>=25 && BMI<=29.9){
  console.log("Sobrepeso");
}
else if( BMI>=30){
  console.log("Obeso");
}