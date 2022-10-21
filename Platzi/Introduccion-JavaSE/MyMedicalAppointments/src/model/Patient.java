package model;

import model.User;

public class Patient extends User {
    int id;

    private String birthday;
    private double weight;
    private double height;
    String blood;

    public Patient(String name, String email){
        super(name, email);
        this.weight = 77.7;

    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    // 54.5 kg String
    public String getWeight(){
        return this.weight+" Kg.";
    }

    public String getHeight() {
        return height + " Mts.";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String toString(){
        return super.toString() + "\nAge: " + birthday + "\n Weight: "+getWeight()+ "\n Height "+getHeight()+"\nBlood"+blood;
    }
}
