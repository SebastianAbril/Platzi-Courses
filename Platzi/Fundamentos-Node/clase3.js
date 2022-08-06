/**
 * EventLoop: Asincronía por defecto
 * 
 * - ¿Qué es el Event Loop?
 *  Es un procfeso con un bucle que gestiona, de forma asíncrona,
 * todos los eventos de tu aplicación.
 * 
 * -Event Queue: contiene todos los ev entos que se generan por
 * nuestro código, estos quedan en una cola que van pasando uno
 * a uno al Event Loop.
 * Thread Pool.Se encarga de gestionar los eventos de forma 
 * asíncrona. Una vez terminado lo devuelve al Event Loop.
 *  El Event Loop vera si lo pasa a Event Queue o no.
 */