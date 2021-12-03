const numero = parseFloat(prompt('Ingrese un numero'));
if(numero % 3 === 0 && numero % 5 !==0 ){
    console.log('bing');
} else if(numero % 5 === 0 && numero % 3 !==0){
    console.log('bong');
} else if(numero % 3 === 0 && numero % 5 === 0){
    console.log('bingbong');
} else{
    console.log(numero);
}