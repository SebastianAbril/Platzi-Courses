public class Patient {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    String blood;

    Patient(){
        System.out.println("Construyendo el objeto Patient");
    }

    Patient(String name, String email){
        this.name = name;
        this.email = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número telefónico debe de 8 dígitos máximo");
        } else if (phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
        
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
}
