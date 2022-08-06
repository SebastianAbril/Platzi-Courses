/* let saludo1 = 'hola';
console.log('Hola'); */

//¿PERO Y SI QUIERA UN VALOR QUE ES COMO INFORMACIÓN DE UNA API 
// O UNA CONTRASEÑA? ENTONCES RECURRIMOS A LAS VARIABLES DE ENTORNO

/**
 * Las variables de entorno son una forma de llamar 
 * información de afuera a nuestro software, sirve para
 *  definir parámetros sencillos de configuración de los 
 * programas de modo que puedan ejecutarse en diferentes 
 * ambiente sin necesidad de modificar el código fuente
 *  de un script.

El objeto process nos da información sobre el procesos
 que está ejecutando este script.
La propiedad env es la que nos da acceso a las variables 
de entorno de manera sencilla.
 */
let nombre = process.env.NOMBRE || 'Sin nombre';
let web = process.env.WEB || 'no tengo web';

console.log('Hola '+ nombre)
console.log('Mi web es '+ web)