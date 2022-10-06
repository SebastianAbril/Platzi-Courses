public class Patient {
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String blood;

    Patient(){
        System.out.println("Construyendo el objeto Patient");
    }

    Patient(String name, String email, String address, String phoneNumber, String birthday, double weight, double height, String blood){
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
        this.blood = blood;


    }
}
