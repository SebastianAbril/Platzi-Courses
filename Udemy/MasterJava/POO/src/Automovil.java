public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindraje;

   /* public void detalle(){
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindraje = " + this.cilindraje);
    }*/

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("abricante = " + this.fabricante+" ");
        sb.append("modelo = " + this.modelo+" ");
        sb.append("color = " + this.color+" ");
        sb.append("cilindraje = " + this.cilindraje+" ");

       return sb.toString();
    }

}

/* La clase debe ser public o default, no tiene sentido
* tener una clase private ya que no se podría usar en cualquier lado.
* Si es static pertenece a la clase y no al objeto, por lo que si un objeto llega a modificar el
* atributo static, va a cambiar pa el atributo pa todos los objetos.
* */
