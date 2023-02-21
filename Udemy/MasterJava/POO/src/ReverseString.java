import java.sql.SQLOutput;

public class ReverseString {
         static void  reverse( String str) {

           for (int i =  (str.length()-1) ; i >= 0; i--) {
               System.out.println(str.charAt(i));

           }

        }
}
