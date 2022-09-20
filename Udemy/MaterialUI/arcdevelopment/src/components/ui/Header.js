import React from 'react';
import AppBar from "@mui/material/AppBar";
import Toolbar from "@mui/material/Toolbar";
import useScrollTrigger from '@mui/material/useScrollTrigger';
import Tabs from "@mui/material/Tabs";
import Tab from "@mui/material/Tab";
import theme from "./Theme";
import Button from "@mui/material/Button";


import logo from "../../assets/logo.svg"

const styles = {
  toolbarMargin:{
    ...theme.mixins.toolbar,
    marginBottom: "3em"
  },
  logo:{
    height: "7em"
  },
  tab: {
    ...theme.typography.tab,
    color: "white",
    minWidth: 10,
    marginLeft: "25px"
  },
  tabContainer:{
    marginLeft:"auto"
  },
  button:{
    ...theme.typography.estimate,
    borderRadius:"50px",
    marginLeft:"50px",
    marginRight:"25px",
    height: "45px",
    
  }

}

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
    console.log(styles.toolbarMargin)
    return (
      <>
        <ElevationScroll>
        <AppBar position="fixed" color="primary">
            <Toolbar disableGutters>
              <img style={styles.logo} alt="company logo" src={logo} />
              <Tabs sx={styles.tabContainer} >
                <Tab sx={styles.tab} label="Home" />
                <Tab sx={styles.tab} label="Services" />
                <Tab sx={styles.tab} label="The Revolution" />
                <Tab sx={styles.tab} label="About Us" />
                <Tab sx={styles.tab} label="Contact Us" />
              </Tabs>

              <Button variant="contained" color="secondary" sx={styles.button}>
                Free Estimate
              </Button>
            </Toolbar>
        </AppBar>
        </ElevationScroll>
         <div style={styles.toolbarMargin} />
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
