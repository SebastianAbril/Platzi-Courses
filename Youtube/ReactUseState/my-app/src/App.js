import React,{ useState, useEffect } from 'react';
import './App.css';
import { OtherComponent } from './OtherComponent';


const App = () => {
  const [showComponent, setShowComponent] = useState(true);

  return (
    <div className="App">
      <button onClick={() => setShowComponent(false)}>Hide Component </button>
      <button onClick={() => setShowComponent(true)}>Show Component </button>
        
      {showComponent && <OtherComponent />}
    </div>
    
  );
}

export default App;
