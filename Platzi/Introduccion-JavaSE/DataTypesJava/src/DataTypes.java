public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.456;
        float nF = 123.456F;

        var salary = 1000; // int
        //pension 3%
        var pension = salary * 0.03; //double
        var totalSalary = salary - pension; //double
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahi Salgado";
        System.out.println("EMPLOYEE: "+employeeName + " SALARY: "+ totalSalary);
    }
}

/*
Enteros:
-byte (1 byte)
-short (2 bytes)
-int (4 bytes)
-long (8 bytes)
 */

/*
Punto Flotante o decimal
-float (4 bytes)
-double (8 bytes)

Para char se pone comilla simple ''

Lógicos:
-boolean: rango, true o false.
Después de Java 10 se puede usar var:
var miVariable = "hola";
 */
