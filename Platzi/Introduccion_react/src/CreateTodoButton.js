import React from 'react';

function CreateTodoButton() {

    const onClickButton = (msg) => {
        alert(msg);
    };
    return (
        <button
            className="CreateTodoButton"
            onClick={ () => onClickButton('pepepepe')}
        >+</button>
    )
}

export { CreateTodoButton }