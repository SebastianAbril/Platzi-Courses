function hola(nombre){
    return new Promise(function(resolve,reject){
        setTimeout( function(){
            console.log('Hola, '+nombre);
            resolve(nombre);
        },1500);
    })   
}

function adios(nombre){
    return new Promise( (resolve,reject) =>{
        setTimeout(function(){
            console.log('Adios ',nombre)
            resolve();
        },1000);
    })

}

function hablar(nombre){
    return new Promise( (resolve,reject) =>{
        setTimeout(function(){
            console.log('Bla bla bla bla bla...');
            //resolve(nombre);
            reject('Hay un error');
        },1000);
    })
}



function conversacion(nombre, veces, callback){
    if(veces > 0){
        hablar(function(){
            conversacion(nombre, --veces, callback);
    
        })
    } else{
        callback(nombre);
    }

}
// LA DIFERENCIA ENTRE LAS PROMESAS Y LOS CALLBACKS, ES QUE LAS
//PROMESAS PODEMOS IRLAS ANIDANDO
// ------
console.log('Iniciando el proceso');
hola('Catalina')
    .then(hablar)
    .then(hablar)
    .then(hablar)
    .then(adios)
    .then((nombre)=>{
        console.log('Terminado el proceso');
    })
    .catch(error =>{
        console.error('Ha habido un error: '+error)
    })