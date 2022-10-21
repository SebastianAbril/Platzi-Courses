package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    static int id = 0; //Autoincrement
    String speciality;

    private int id_availableAppointment;
    private Date date;
    private String time;
    // Available Appointment

    //Comportamientos

    public Doctor(String name, String email, String speciality) {
        super(name,email);
        System.out.println("El nombre del model.Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(getName());
    }
    public void showId(){
        System.out.println("ID model.Doctor: "+id);
    }
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment (Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));

    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSpeciality: "+speciality+"\nAvailable "+availableAppointments.toString();
    }
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;


        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString(){
            return "Available Appointments \nDate: " + date + "\nTime: "+time;
        }
    }



}

/**
 * Declarando un objeto
 * model.Doctor myDoctor;
 * tipo de objeto - Nombre del objeto
 *
 * myDoctor = new model.Doctor();
 *
 * Los metodos con final o static no se pueden sobre escribir
 */