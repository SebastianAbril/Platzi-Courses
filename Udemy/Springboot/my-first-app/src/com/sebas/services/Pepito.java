package com.sebas.services;

import com.sebas.entidades.Entidad;

public class Pepito implements EntidadService {
    @Override
    public void altaEntidad(Entidad entidad) {
        System.out.println("hola pepe");
    }
}
