let name = 'Sebas';
let edad = 32;
//es5
obj = { name: name, age: age};
// es6
obj2 = { name, age };
console.log(obj2);

// Arrow Function
const names = [
    {name: 'Sebastian', age: 32},
    {name: 'Mariana', age: 27}
]

let listOfNames = names.map(function (item){
    console.log(item.name);
})

// Las Arrow Function son funciones anónimas
let listOfNames2 = names.map(item => console.log(item.name));

const listOfNames3 = (name, age, country) => {
    ...
}

const listOfNames4 = name => {
    ...
}
const square = num => num * num;

// PROMESAS (CON LAS CUALES SE TRABAJA EL ASINCRONISMO)

const helloPromise = () => {
    return new Promise((resolve, reject) =>{
        if (true){
            resolve('Hey!');
        } else {
        reject('Ups!!');
        }
    });
}

helloPromise()
    .then(response => console.log(response))
    .then(( => console.log('hola')))
    .catch(error => console.log(error));