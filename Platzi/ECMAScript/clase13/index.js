//ES12
//replaceAll() es diferente a replace()

const string = "Javascript es maravilloso, con Javascript puedo crear el futuro de la Web";
const replacedString = string.replace("Javascript","Python");
console.log(replacedString);

const replacedString2 = string.replaceAll("Javascript","Python");
console.log(replacedString2);

//Metodos privados que se podran usar dentro de las clases, para volverlo privado le pongo el # antes del metodo.
class Message {
    #show(val) {
        console.log(val);
    };
    get #add(val){
        ...
    }
}
const message = new Message();
message.show('hola');

// Promise.any es un objeto global de promsie cuyo argumento va a ser la forma de un array de promises que le pasamos.
const promise1 = new Promise((resolve,reject) => reject("1") );
const promise2 = new Promise((resolve,reject) => resolve("2") );
const promise3 = new Promise((resolve,reject) => resolve("3") );

Promise.any([promise1, promise2, promise3])
.then(response => console.log(response));

//
class anyClass {
    constructor(element){
        this.ref = new WeakRef(element)
    }
    {...}
}

//
let isTrue = true;
let isFalse = false;
console.log(isTrue &&= isFalse);

let isTrue = true;
let isFalse = false;
console.log(isTrue ||= isFalse );

let isTrue = undefined;
let isFalse = false;
console.log(isTrue ??= isFalse);