import java.sql.SQLOutput;

public class Ejercicio2 {
    public static void main(String[] args) {

        char c = 'z'; //Convertirlo a int
        int cI = (int) c; // cast explicito
        System.out.println(cI);

        int i = 250; //convertirlo a long, y de long a short;
        long iL = i; // cast implicito
        short iLS = (short) iL; //cast explicito
        System.out.println(iL);
        System.out.println(iLS);

        double d = 301.057;
        long dL = (long) d;
        System.out.println(dL );

        int number = 100;
        float numberResult = (float) (number+5000.66) ;
        System.out.println(numberResult);

        int numberTwo = 737;
        byte resultNumberTwo = (byte) (numberTwo*100);
        System.out.println(resultNumberTwo);

        double number3 = 298.638;
        double number3Result = (long) (number3/25);
        System.out.println(number3Result);
    }
}
