// LO QUE SE IMPLEMENTO EN ES8
const data = {
    frontend: 'Oscar',
    backend: 'Isabel',
    design: 'Ana',
}
// CONVERTIR UN OBJETO EN UNA MATRIZ (ARRAY)
// con Objet.entries
const entries = Object.entries(data);
console.log(entries);
console.log(entries.length);

const data = {
    frontend: 'Oscar',
    backend: 'Isabel',
    design: 'Ana',
}

// CREA UN ARREGLO CON LOS VALORES
const values = Object.values(data);
console.log(values)
console.log(values.length);

// con string.padStart SE PUEDEN AGREGAR MAS CARACTERES A UN STRING, EL PRIMER ARGUMENTO SON EL MAXIMO DE LETRAS Y EL SEGUNDO LAS LETRAS A AGREGAR
const string = 'hello';
console.log(string.padStart(7,'hi'));
console.log(string.padEnd(12, ' ----'));
console.log('food'.padEnd(12, ' -----'));