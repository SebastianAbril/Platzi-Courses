import React,{ useState, useEffect } from 'react';
import './App.css';


const App = () => {
  const [count,setCount] = useState(5);
  const [secondCount, setSecondCount] = useState(1);

  useEffect( () =>{
    setCount(count+1);
  },[secondCount]);

  return (
    <div className="App">{count}---{secondCount}
    <button onClick={ () => setSecondCount(secondCount+1)}>Increment Second</button>
    </div>
    
  );
}

export default App;
