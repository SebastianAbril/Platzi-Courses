public class IfStatements {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            // Send file
            fileSended++;
            System.out.println("Archivo Enviado");

        } else {
            fileSended--;
            System.out.println("Por favor enciende el Bluetooth, para iniciar la transferencia");
        }
    }
}
