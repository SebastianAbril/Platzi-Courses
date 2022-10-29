import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

       // showMenu();
       Doctor myDoctor = new Doctor("Irina Abril", "irinaAbril@gmail.com", "Pediatria");

       User user = new Doctor ("Sebastian", "Sebastian@gmail.com", "Musculología");
       user.showDataUser();

       User userPa = new Patient("Hellsito","dogg");
       userPa.showDataUser();

/*
       myDoctor.addAvailableAppointment(new Date(), "4pm");
       myDoctor.addAvailableAppointment(new Date(), "10pm");
       myDoctor.addAvailableAppointment(new Date(), "1pm"); */
/*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+" "+aA.getTime());
        }

*/
        System.out.println(myDoctor);
    }


}

/**
 * Metodos static
 * ¿Que es Static? se utiliza para definir métodos o variables de ese tipo estático. Utilizamos Static para llamar una variable sin utilizar un objeto. Se invoca en una clase que no tiene instancias de la clase.
 *
 * ¿Que nivel de Scope tiene una variable de tipo Static? Una variable de ese tipo, mantiene su ciclo de vida en todo el programa mientras este corriendo el programa.
 *
 * INTERFACES
 * Es un tipo de referencia similar a una clase que podría contener solo constantes y definiciones de métodos
 * Se establece la forma de una clase (nombres de métodos, listas de argumentos y tipos de retorno,
 * pero no bloques de código
 */
