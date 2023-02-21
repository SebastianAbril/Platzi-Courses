public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impresa");

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


        Automovil batimovil = new Automovil();
        batimovil.setFabricante(null);
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.verDetalle());

        System.out.println("Kilometros por litro(estatico): "+Automovil.calcularConsumoEstatico(300,60));



    }
}


