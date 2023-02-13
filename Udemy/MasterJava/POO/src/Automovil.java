public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindraje;
    int capacidadEstanque = 40;

   /* public void detalle(){
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindraje = " + this.cilindraje);
    }*/

    public String verDetalle(){
        return"fabricante = " + this.fabricante +
                "\nmodelo = " + this.modelo +
                "\ncolor = " + this.color +
                "\ncilindraje = " + this.cilindraje;
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
}

/* La clase debe ser public o default, no tiene sentido
* tener una clase private ya que no se podría usar en cualquier lado.
* Si es static pertenece a la clase y no al objeto, por lo que si un objeto llega a modificar el
* atributo static, va a cambiar pa el atributo pa todos los objetos.
* */
