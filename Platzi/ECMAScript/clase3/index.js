//LET y CONST, Multilínea, Spread Operator y Desestructuración

let lorem = 'sdfsdfdsfsdfsdfsdfsafasas \n' + 'asfasfasf';

console.log(lorem);

let lorem2 = `jajajajaja
peeppepe`

console.log(lorem2);


let person = {
    'name': 'oscar',
    'age': 32,
    'country': 'COL'
  }
  console.log(person.name, person.age)

let {name}= person;
console.log(name);

let team1 = ['Oscar','Julian', 'Ricardo'];
let team2 = ['Valeria', 'Yesica', 'Camila'];

let education = ['David', ...team1, ...team2];

console.log(education);

{
  var globalVar = "Global Var";
}
{
  let globalLet = 'Global Let';
}

console.log(globalVar);
console.log(globalLet);