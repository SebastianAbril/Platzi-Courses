const mat = [
    ["Pablo", "Maria", "Pedro"],
    ["Diana", "Juan", "Federico"],
    ["Roberto", "Daniel", "Sandra"]
  ]
  
   for(let i=0 ; i< mat.length; i++){
     let position = mat[i];
     console.log(`Grupo ${i+1}:`);
     
  
      for(index=0; index < position.length ;index++){
        let positionTwo = position[index];
        console.log(`  ${positionTwo}`);
        }    
   }