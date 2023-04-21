package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.manytoone.Persona;
import com.springsimplespasos.hibernate.entidades.manytoone.Telefono;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class MainJPQL {
    public static void main(String[] args) {
        // SQL NATIVO SELECT * FROM  personas WHERE codigo = ?
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();

        Query query = session.createQuery("select p from Persona p where p.codigo = ?1");
        query.setParameter(1, Integer.parseInt("1"));

        Persona persona = (Persona) query.getSingleResult();
        System.out.println(persona.getNombre());

        // SELECT * FROM personas p JOIN telefonos t on p.codigo = t.codigo where p.codigo = ?

        Query queryDos = session.createQuery("select p from Persona p where p.codigo = :codigo");
        queryDos.setParameter("codigo", Integer.parseInt("1"));

        List<Telefono> telefonos = queryDos.getResultList();
        telefonos.forEach( telefono -> System.out.println(telefono.getNumero()));


       

        session.close();
    }
}

// JPQL = Java Persistence Query Language, es propio de JPA
