package EjerciciosEdabit;

public class Programmers {
    public static int programmers(int one, int two, int three) {
        int highest = 0;
        int lowest = 0;

        if(one > two && one > three){
            highest = one;
        } else if ( two > one && two > three){
            highest = two;
        } else {
            highest = three;
        }

        if(one < two && one < three){
            lowest = one;
        } else if ( two < one && two < three){
            lowest = two;
        } else {
            lowest = three;
        }

        return (highest - lowest);

    }
}
