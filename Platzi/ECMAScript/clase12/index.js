//ES11
// trabajar con numeros enteros mayores a 2 a la 53: big Int
// agregando una "n" al final del numero o con el metodo BigInt(number);

const aBigNumber = 9007199254740991n;
const anotherBigNumber = BigInt(9007199254740991);
console.log(aBigNumber);
console.log(anotherBigNumber);

// PromiseAllSettled

const promise1 = new Promise((resolve,reject) => reject("reject"));
const promise2 = new Promise((resolve,reject) => resolve("resolve"));
const promise3 = new Promise((resolve,reject) => resolve("resolve 1"));

Promise.allSettled([promise1, promise2, promise3])
    .then(response => console.log(response))

// globalThis

console.log(window);
console.log(globalThis);

const fooo = null ?? 'default string';
console.log(fooo);

const foooo = 'Sebas' ?? 'default string';
console.log(foooo);

// acceder a objetos y arreglos

const user = {};
console.log(user?.profile?.email);

if(user?.profile?.email){
    console.log('email')
}else{
    console.log('fail');
}
