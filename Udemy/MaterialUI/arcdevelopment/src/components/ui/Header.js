import React from 'react';
import AppBar from "@mui/material/AppBar";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography"
import useScrollTrigger from '@mui/material/useScrollTrigger';


function ElevationScroll(props) {
    const { children} = props;
    
    const trigger = useScrollTrigger({
      disableHysteresis: true,
      threshold: 0
    
    });
  
    return React.cloneElement(children, {
      elevation: trigger ? 4 : 0,
    });
  }
  


export default function Header(props){
    return (
        <ElevationScroll>
        <AppBar position="fixed" color="primary">
            <Toolbar>
              <Typography variant="h3"> 
                Arc Developmentss
              </Typography>
                
            </Toolbar>
        </AppBar>
        </ElevationScroll>
    )
}

/**
 *  Appbar viene por defecto con "position: fixed"
 *  De MaterialUI en la documentación del componente AppBar busco
 * scrolling y luego copio el código de ElevationScroll y pego.
 * 
 * 
 */
