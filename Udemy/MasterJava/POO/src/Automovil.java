public class Automovil {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id = 0;

    private String fabricante;
    private String modelo;
    private String color = "gris";
     private double cilindraje;
     private int capacidadEstanque = 40;

    private static int capacidadEstanqueEstatico = 70;
    private static int ultimoId;

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    private static String colorPatente = "Naranja";

   /* public void detalle(){
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindraje = " + this.cilindraje);
    }*/
   public Automovil(){
        this.id = ++ultimoId;
   }


    public Automovil(String fabricante, String modelo){
       this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindraje) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        this(fabricante,modelo,color);
        this.cilindraje = cilindraje;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindraje, int capacidadEstanque) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        //this.cilindraje = cilindraje;
        this(fabricante,modelo,color,cilindraje);
        this.capacidadEstanque = capacidadEstanque;
    }
    public String verDetalle(){
        return  "id = "+ this.getId()+
                "\nfabricante = " + this.getFabricante() +
                "\nmodelo = " + this.getModelo() +
                "\ncolor = " + this.getColor() +
                "\ncolorPatente= "+Automovil.colorPatente  +
                "\ncilindraje = " + this.getCilindraje();
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return "el auto "+this.fabricante+" frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadEstanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadEstanque*(porcentajeBencina/100f));
    }

    public static float calcularConsumoEstatico(int km, float porcentajeBencina){
        return km/(Automovil.capacidadEstanqueEstatico*(porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + cilindraje +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}

/* La clase debe ser public o default, no tiene sentido
* tener una clase private ya que no se podría usar en cualquier lado.
* Si es static pertenece a la clase y no al objeto, por lo que si un objeto llega a modificar el
* atributo static, va a cambiar pa el atributo pa todos los objetos.
* */
