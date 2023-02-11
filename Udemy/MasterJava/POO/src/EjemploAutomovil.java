public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.fabricante = "Subaru";
        auto.modelo = "Impresa";
        auto.cilindraje = 2.0;
        auto.color = "Blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.cilindraje = 3.0;
        mazda.color = "Rojo";

        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impresa";
        subaru.cilindraje = 2.0;
        subaru.color = "Blanco";


        System.out.println(auto.detalle());
        mazda.detalle();
    }
}


/* Programacion estructura/secuencial y POO
* Dentro de una clase nunca se deben imprimir datos, es una mala practica
* */