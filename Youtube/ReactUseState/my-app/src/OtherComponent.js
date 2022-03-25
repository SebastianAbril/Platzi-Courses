import React, {useEffect} from 'react';

const OtherComponent = () => {
  useEffect( () =>{
    console.log('component did mount');

    return () =>{
      console.log('component will unmount')
    }

  },[]); // empty array of dependencies
  return (<div>Other Component</div>)
    
};

export {OtherComponent}