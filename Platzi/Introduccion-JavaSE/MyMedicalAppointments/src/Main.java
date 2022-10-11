import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

       // showMenu();
       Doctor myDoctor = new Doctor("Irina Abril", "Pediatria");
       myDoctor.addAvailableAppointment(new Date(), "4pm");
       myDoctor.addAvailableAppointment(new Date(), "10pm");
       myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+" "+aA.getTime());
        }
       //System.out.println(myDoctor.name);
       //System.out.println(myDoctor.speciality);

/*
        Patient juanPerez = new Patient( "Juan", "juan@gmail.com");
        juanPerez.setWeight(78.9);
        System.out.println(juanPerez.getWeight());

        juanPerez.setPhoneNumber("334553463464");

*//*
    Patient patientOne = new Patient("Ramira", "ramira@gmail.com");
    Patient patientTwo = new Patient("Angelica" , "angelica@gmail.com");

        System.out.println(patientOne);
        System.out.println(patientTwo);

        System.out.println(patientOne.getName());
        System.out.println(patientTwo.getName());

        patientTwo = patientOne;
        System.out.println(patientOne.getName());
        System.out.println(patientTwo.getName());

        System.out.println();
        System.out.println(patientOne);
        System.out.println(patientTwo);

        System.out.println();
        patientTwo.setName("SebastianYCatalina");
        System.out.println(patientOne.getName());
        System.out.println(patientTwo.getName());
*/
    }


}

/**
 * Metodos static
 * ¿Que es Static? se utiliza para definir métodos o variables de ese tipo estático. Utilizamos Static para llamar una variable sin utilizar un objeto. Se invoca en una clase que no tiene instancias de la clase.
 *
 * ¿Que nivel de Scope tiene una variable de tipo Static? Una variable de ese tipo, mantiene su ciclo de vida en todo el programa mientras este corriendo el programa.
 */
