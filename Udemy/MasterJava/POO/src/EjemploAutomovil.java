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


        System.out.println(auto.verDetalle());
        mazda.verDetalle();
        System.out.println(mazda.acelerar(2000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(5000));

        System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300,60));
    }
}


/* Programacion estructura/secuencial y POO
* Dentro de una clase nunca se deben imprimir datos, es una mala practica
* */

/*
* CLASE 134: El principio de ECANSUPLAMIENTO se confunde mucho con el principio de OCULTACION
*  OCULTACIÓN: private, protected, public. ENCAPSULAMIENTO: la abastracción que tienen los metodos cuando se llaman en algun objeto. Ejemeplo: hago uso del metodo
* acelerarFrenar() pero yo no sé qué hace exactamente el método ni como está implementado.
*
* POLIMORFISMO: Diferente forma de hacer lo mismo:
* */