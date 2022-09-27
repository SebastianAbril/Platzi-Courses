public class NamingJava {
    public static void main(String[] args) {
        int cellphone = 3333;
        int cellPhone = 33352325;

        System.out.println(cellphone);
        System.out.println(cellPhone);

        String $countryName = "Spain";
        String _backgroundColor = "Green";

        String currency$ = "MXN";
        String background_color = "BLUE";

        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        //Lower Camel Case
        String fullName = "Irene Ahagi Shelgoe";
        int sizeInCentimeters = 26;


    }
}

/*
Letras posteriores pueden ser letras, numeros, $ y "_"
Las constantes se escriben en mayúsculas y contienen "_".
 */

/*
TECNICA DE NAMING: CAMEL CASE

-Upper Camel Case: para clases e interfaces. example: public class Connection{
}
-Lower Camel Case: para  variables. example: String isAvailable = true;
-Snake Case: para constantes
public class Config{
	public static final int MAX_SIZE = 30;
}

 */