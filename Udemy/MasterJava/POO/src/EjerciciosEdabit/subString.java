package EjerciciosEdabit;

public class subString {
    public static String palabra = "Grandeza";
    static String subEstriniar(String word){
        String preWord = word.substring(0,2);
        String solution = preWord +"... " + preWord +"... " + word;
        return solution;
    }
}
