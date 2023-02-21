package EjerciciosEdabit;

public class CapitalizeFirstLetter {

    public static String CapitalizeFirstLetra(String left, String right){
        String solution = left.substring(0,1).toUpperCase() + left.substring(1)+right;
        return solution;
    }
}
