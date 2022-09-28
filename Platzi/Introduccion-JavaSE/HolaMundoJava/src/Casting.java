public class Casting {
    public static void main(String[] args) {

        //En un año ubique 30 perritos
        // Cuantos perritos ubique al mes

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        //ESTIMACION
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

    }
}
