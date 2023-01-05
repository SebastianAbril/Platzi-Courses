package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    static int id = 0; //Autoincrement
    String speciality;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    private int id_availableAppointment;
    private Date date;
    private String time;
    // Available Appointment

    //Comportamientos

    public Doctor(String name, String email) {
        super(name,email);

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

    public void addAvailableAppointment (String date, String time){

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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");


        public AvailableAppointment(String date, String time) {
            try{
                this.date = format.parse(date);
            } catch (ParseException e){
                e.printStackTrace();
            }

            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE) {
            return format.format(date);
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

        @Override
        public void showDataUser(){
            System.out.println("Hospital: Cruz Roja");
            System.out.println("Departamento: Cancerología");
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