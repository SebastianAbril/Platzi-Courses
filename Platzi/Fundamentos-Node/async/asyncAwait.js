async function hola(nombre){
    return new Promise(function(resolve,reject){
        setTimeout( function(){
            console.log('Hola, '+nombre);
            resolve(nombre);
        },1500);
    })   
}

async function adios(nombre){
    return new Promise( (resolve,reject) =>{
        setTimeout(function(){
            console.log('Adios ',nombre)
            resolve();
        },1000);
    })

}

async function hablar(nombre){
    return new Promise( (resolve,reject) =>{
        setTimeout(function(){
            console.log('Bla bla bla bla bla...');
            resolve(nombre);
            
        },1000);
    })
}

async function main(){
    await hola("Daniela");
    await hablar();
    await hablar();
    await adios("Daniela");
    console.log('finalizamos el proceso');
}

console.log('empezamos el proceso');
main();

