public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impresa");

        auto.setCilindraje(2.0);
        auto.setColor(Color.BLANCO);



        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setCilindraje(3.0);
        mazda.setColor(Color.ROJO);

        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impresa");
        subaru.setCilindraje(2.0);
        subaru.setColor(Color.AZUL);


        Automovil batimovil = new Automovil();
        batimovil.setFabricante(null);
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.verDetalle());

        System.out.println("Kilometros por litro(estatico): "+Automovil.calcularConsumoEstatico(300,60));
        System.out.println("Velocidad máxima en carretera: "+ Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima en ciudad: "+ Automovil.VELOCIDAD_MAX_CIUDAD);



    }
}


