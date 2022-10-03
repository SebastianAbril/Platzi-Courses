public class ForLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        turnOnOffLight();
        for (int i = 1; i <= 10 ; i++) {
            printSOS();
        }
    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight) ?false: true;
        return isTurnOnLight;
    }
}
 /**
  * Las opciones que hay para detener ciclos y controlar el fujo son:
  * 1. Break:
  * - En un Swtich: en esta situación break hace que el flujo del switch no continue ejecutandose a la sigueinte comparación, esto con el objetivo de que
  * solo se cumpla en una condición.
  * - Para salir de un bucle: break es capaz de detener el flujo en el código, en este caso detendremos el ciclo como tal terminandolo y haciendo
  * que saltemos a la siguiente instrucción despues del ciclo.
  *
  * 2. Continue: Continue en cierto modo también nos va a serv ir para detener un ciclo pero en lugar de terminarlo como en el caso de break,
  * este volverá directo a la condición.
  *
  *3. Return: aunque en algunos lenguajes esta sentencia sirve como un tipo goto, dónde se rompe el flujo del programa
  * la mejor forma de usarlo en Java es en Funciones, cuando lo usamos aquísiempre viene acompañado de un valor, el cual indica
  * el dato que se estará devolviendo en la función.
  *
  */



