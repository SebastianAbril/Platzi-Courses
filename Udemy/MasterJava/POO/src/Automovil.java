public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindraje;

}

/* La clase debe ser public o default, no tiene sentido
* tener una clase private ya que no se podría usar en cualquier lado.
* Si es static pertenece a la clase y no al objeto, por lo que si un objeto llega a modificar el
* atributo static, va a cambiar pa el atributo pa todos los objetos.
* */
