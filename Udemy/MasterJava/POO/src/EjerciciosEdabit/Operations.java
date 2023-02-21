package EjerciciosEdabit;

public class Operations {
    public static int operate(int num1, int num2, String operator) {
        switch(operator){
            case "+":
                return (num1+num2);
            case "-":
                return (num1-num2);

            case "%":
                return (num1%num2);

            case "*":
                return(num1*num2);

            case "/":
                return num1/num2;

            default:
                return num1 % num2;

        }
    }
}
