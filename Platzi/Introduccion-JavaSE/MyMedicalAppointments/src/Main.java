import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor(); // Metodo Constructor
        myDoctor.name = "Irina";
        myDoctor.speciality = "Pediatra";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);

        showMenu();

    }


}

/**
 * Metodos static
 * ¿Que es Static? se utiliza para definir métodos o variables de ese tipo estático. Utilizamos Static para llamar una variable sin utilizar un objeto. Se invoca en una clase que no tiene instancias de la clase.
 *
 * ¿Que nivel de Scope tiene una variable de tipo Static? Una variable de ese tipo, mantiene su ciclo de vida en todo el programa mientras este corriendo el programa.
 */
