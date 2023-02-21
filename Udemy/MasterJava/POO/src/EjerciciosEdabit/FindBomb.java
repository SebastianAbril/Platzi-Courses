package EjerciciosEdabit;

public class FindBomb {
    public static String bomb(String str) {
        String lowerCaseString = str.toLowerCase();
        if(lowerCaseString.contains("bomb")){
            return "DUCK!";
        } else {
            return "Relax, there's no bomb.";
        }


    }
}

