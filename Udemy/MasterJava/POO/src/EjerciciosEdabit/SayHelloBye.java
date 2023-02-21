package EjerciciosEdabit;

public class SayHelloBye {
    public static String sayHelloOrBye(String name, int num) {
        String capitalizedName = name.substring(0,1).toUpperCase() + name.substring(1);
        String solution ="";
        switch(num){
            case 1:
                solution = "Hello "+capitalizedName;
            case 0:
                solution= "Bye "+capitalizedName;
        }

        return solution;
    }
}
