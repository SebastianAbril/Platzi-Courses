package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.SimpleEntity;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class HibernateMain {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();

        //Bloque Insert
        /*SimpleEntity entity = new SimpleEntity();
        entity.setNombre("descripcion");
        session.save(entity);*/

        //Bloque update
        /*SimpleEntity entityUpdate = new SimpleEntity();
        entityUpdate.setCodigo(2);
        entityUpdate.setNombre("Descripcion update!");
        session.update(entityUpdate);*/

        //Bloque delete
        /*SimpleEntity entityDelete = new SimpleEntity();
        entityDelete.setCodigo(1);
        session.delete(entityDelete);*/

        /*SimpleEntity entityRead = session.get(SimpleEntity.class,2);
        System.out.println(entityRead.getNombre());*/



        SimpleEntity entity = new SimpleEntity();
        entity.setNombre("descripcion");

        SimpleEntity entityUpdate = new SimpleEntity();
        entityUpdate.setCodigo(2);
        entityUpdate.setNombre("Descripcion update!");

        session.saveOrUpdate(entity);
        session.saveOrUpdate(entityUpdate);


        session.getTransaction().commit();
        session.close();
    }

}

/**
 * CARDINALIDADES
 *
 * - de Uno a Uno.
 * - de Uno a Muchos.
 * - de Muchos a Uno.
 * - de Muchos a Muchos.
 *
 */
