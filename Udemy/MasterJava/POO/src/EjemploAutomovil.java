public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impresa");

        //auto.setFabricante("Subaru");
        //auto.setModelo("Impresa");
        auto.setCilindraje(2.0);
        auto.setColor("Blanco");



        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setCilindraje(3.0);
        mazda.setColor("Rojo");

        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impresa");
        subaru.setCilindraje(2.0);
        subaru.setColor("Blanco");


        System.out.println(auto.verDetalle());
        mazda.verDetalle();
        System.out.println(mazda.acelerar(2000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(5000));

        System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300,60));

        System.out.println("Fabricante es: "+auto.getFabricante());
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

/*
*   CLASE 135: PRINCIPIO DE OCULTACIÓN DE LOS ATRIBUTOS
*
* Como buena practica y principio los atributos de la clase tienen que ser privados y solamente se puedan
* exponer para editar y leer mediante metodos.
*
* Cuando es privado solamente se puede acceder o modificar dentro de la clase. Es decir no podre hacer un objeto.atributo = X cosa
* o un System.out.println(ojeto.atributo) por fuera de la clase ya que es privado.
* */

/*
*   CLASE 136:  OCULTACION METODOS GET Y SET
*
*  POJO (Plain Old Java Object)
* */

/*
*  CLASE 137: IMPLEMENTANDO CONSTRUCTOR
*  Se podria hacer una sobrecarga de constructores, es decir hacer varias versiones de constructor. La sobrecarga de metodos
* es cuando implemento el mismo method, pero con diferentes argumentos, de esta manera se generan diferentes versiones.
*
* OJO: Los constructores solo se pueden llamar con el new, no se pueden llamar como si fueran otro metodo
*
* */