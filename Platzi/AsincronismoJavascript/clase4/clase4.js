// ¿Qué es un Callback?
// Es una función que al crearla recibe como parametro una segunda funcion
//y al momento de hacer una aplicacion o llamado asincrono esta se ejecuta
// pwd ;  mkdir asincronismo ; cd asincronismo ; git init ;
// npm init ; Luego llenar información: name, description, entry point, text commanod(nada),git repository,
// Keywords: ballbacks, promise, async ; License : "MIT"  ; ok

function sum(num1, num2) {
    return num1 + num2;
}

function calc(num1, num2, callback){
    return callback(num1, num2);
}

console.log(calc(2, 2, sum));

function date(callback){
    console.log(new Date);
    setTimeout(function (){
        let date = new Date;
        callback(date);
    }, 3000)
}

function printDate(dateNow) {
    console.log(dateNow);
}

date(printDate);
