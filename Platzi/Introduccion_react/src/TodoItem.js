import React from 'react';

function TodoItem(props){
    const onComplete = () => {
        alert('ya completaste el todo '+ props.text);
    };

    const onDelete = () => {
        alert('ya borraste '+ props.text);
    };

    return (
        <li className="TodoItem">
            <span onClick={onComplete}> C </span>
            <p> {props.text} </p>
            <span onClick={onDelete}> X </span>
        </li>
    );
}

export { TodoItem }