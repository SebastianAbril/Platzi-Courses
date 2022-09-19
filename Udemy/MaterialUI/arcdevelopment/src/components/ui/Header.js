import React from 'react';
import AppBar from "@mui/material/AppBar";
import Toolbar from "@mui/material/Toolbar";
import useScrollTrigger from '@mui/material/useScrollTrigger';

import logo from "../../assets/logo.svg"

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
      <>
        <ElevationScroll>
        <AppBar position="fixed" color="primary">
            <Toolbar disableGutters>
              <img style={{height:"7em"}} alt="company logo" src={logo} />
                
            </Toolbar>
        </AppBar>
        </ElevationScroll>
        <Toolbar sx={{marginBottom:"3em"}} />
        <div>Hello there</div>
        </>
    )
}

/**
 *  Appbar viene por defecto con "position: fixed"
 *  De MaterialUI en la documentación del componente AppBar busco
 * scrolling y luego copio el código de ElevationScroll y pego.
 * 
 * La prop "disableGutters={true}" me quita los padding for defecto
 * del Toolbar
 */
