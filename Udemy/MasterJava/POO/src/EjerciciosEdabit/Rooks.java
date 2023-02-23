package EjerciciosEdabit;
//["A8", "E8"]
public class Rooks {
    public static boolean canCapture(String[] rooks) {
        String rook1 = rooks[0];
        String rook2 = rooks[1];

        if (rook1.charAt(0) == rook2.charAt(0) || rook1.charAt(1) == rook2.charAt(1)  ){
            return true;
        } else {
            return false;
        }

    }

}
