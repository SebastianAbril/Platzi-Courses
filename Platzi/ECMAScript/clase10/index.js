
let array = [1,2,3, [1,2,3, [1,2,3]] ];

// array.flat(profundidad) = devuelve el array con la matriz aplanada
console.log(array.flat(2));
// flat.map

let array = [1,2,3,4,5];

console.log(array.flatMap(value => [value, value * 2]));

// eliminar espacios en blanco de un string
let hello = '    hello world';
console.log(hello);
console.log(hello.trimStart());

let hello1 = 'hello World    '
console.log(hello1);
console.log(hello1.trimEnd());

try {

} catch {
    error
}
// CONVERTITR UN ARRAY EN UN OBJETO: Object.fromEntries(array)
let entries = [["name", "sebas"], ["Age", 32]];

console.log(Object.fromEntries(entries))

let mySymbl = `My Symbol`;
let symbol = Symbol(mySymbl);
console.log(symbol.description);