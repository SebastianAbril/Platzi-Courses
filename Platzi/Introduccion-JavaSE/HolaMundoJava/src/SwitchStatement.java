public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Darkss";

        switch(colorModeSelected){
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion");
                break;
        }
    }
}
