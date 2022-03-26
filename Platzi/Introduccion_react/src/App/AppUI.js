import React from 'react';
import { TodoCounter } from '../TodoCounter';
import {TodoContext } from '../TodoContext';
import {TodoSearch } from '../TodoSearch';
import { TodoList } from '../TodoList';
import { CreateTodoButton } from '../CreateTodoButton';
import { TodoItem } from '../TodoItem';
import { TodoForm } from '../TodoForm'; 
import './App.css';
import {Modal} from '../Modal/index';

function AppUI(){
    const {
        error, 
        loading, 
        searchedTodos, 
        completeTodo,
        deleteTodo,
        openModal,
        setOpenModal,
    } = React.useContext(TodoContext);


    return (
        <React.Fragment>
            <TodoCounter/>
            <TodoSearch />
             <TodoList>
                {error && <p>Desesperate, hubo un error...</p>}
                {loading && <p>Estamos cargando, no desesperes...</p>}
                {(!loading && !searchedTodos.length) && <p>Crea tu primer TODO!</p>}
    
                        {searchedTodos.map( todo => (
                        <TodoItem
                            key={todo.text} 
                            text={todo.text}
                            completed={todo.completed}
                            onComplete= { () => completeTodo(todo.text)}
                            onDelete= { () => deleteTodo(todo.text)}
                        />
                        ))}
            </TodoList>
            
            {!!openModal && (
                <Modal>
                <TodoForm/>
                </Modal>
            )}
            <CreateTodoButton
                setOpenModal = {setOpenModal}
            />
        </React.Fragment>
    );
}
export {AppUI};