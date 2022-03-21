import React from 'react';
import './TodoCounter.css';

/* FORMA DE PONER ESTILOS IN-LINE*/
/*
const estilos = {
    color: 'red',
    backgroundColor: 'yellow',
    textAlign: 'center',
    fontSize: '24px'
 };

function TodoCounter() {
    return (
        <h2 style={estilos}> Has completado 2 de 3 TODOs</h2>
    );
}
*/


function TodoCounter({total, completed}) {
    
    return (
        <h2 className = "TodoCounter"> Has {completed} de {total} TODOs</h2>
    );
}



export { TodoCounter }; 