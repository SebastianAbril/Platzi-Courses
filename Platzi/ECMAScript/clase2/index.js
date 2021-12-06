function newFunction(name,age,country){
    var name = name || 'sebastian';
    var age = age || 32;
    var country = country || 'MX';
    console.log(name,age,country);
}

//es6
function newFunction2(name = 'sebastian', age = 32, country = 'COL'){
    console.log(name,age,country);
}

let hello = "Hello";
let world = "World";
let epicPhrase = hello + ' ' + world;

let secondEpicPhrase = `${hello} ${world}`;
