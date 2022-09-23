public class HolaMundo {
    public static void main(String[] args){
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;

        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        var numero3 = "15";

        String nombre;

        nombre = "Andrés";

        if(numero >10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);
    }
}
// para comentar una linea
/* para comentar varias
lineas:
una variable debe comenzar con una letra, no puede comenzar con un numero. Se
vale el guion bajo _
evitar acentos y eñes
 */
