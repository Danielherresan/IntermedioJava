package dan.herr.san.poo.Session6;

import java.util.Date;


public class ExampleAbstrac {
    public static void main(String[] args) {


        //Declarando un objeto tipo doctor
        Doctor newDoctor;


        //instanciar el objeto
        newDoctor = new Doctor("Daniel Herrera", "NeurologoDan@salud.com");
        newDoctor.setSpeciality("Neurólogo");

        Patient newPatient = new Patient("Maria Fernanda","mafer@gmail.com");
        newPatient.setWeight(50.3);
        newPatient.setHeight(1.56);
        newPatient.setBirthday("26/2/1994");
        newPatient.setBlood("O+");
        //Cuando abstraemos en setters and getters podemos hacer encapsulamiento
        //de las variables y hasta tener control sobre ellas
        newPatient.setPhoneNumber("123456789");
        System.out.println(newPatient.getPhoneNumber());

        //en este caso cumplirá la regla del negocio
        newPatient.setPhoneNumber("12345678");
        System.out.println(newPatient.getPhoneNumber());

        //showMenu();

        //creando citas

        newDoctor.addAvailableAppointments(new Date(), "4 pm");
        newDoctor.addAvailableAppointments(new Date(), "10 am");
        newDoctor.addAvailableAppointments(new Date(), "12 pm");

        //si imprimimos el get a la lista obtendremos la lista de objetos
        System.out.println(newDoctor.getAvailableAppointments());
        for (Doctor.AvailableAppointment element: newDoctor.getAvailableAppointments()
             ) {
            System.out.println(element.getDate() + " " + element.getTime());
        }

        //en este caso se muestra la salida de sobre-escribir el método toString
        System.out.println(newPatient);
        System.out.println(newDoctor);

        //ahora empleemos el método abstracto el cual nos ayudará a identificar
        // que atribuye un comportamiento diferente para cada clase
        User user = new Doctor("Mafer","mafer@buencorreo.com");
        User userOther = new Patient("Daniel","daniel@buencorreo.com");

        //obtendremos diferentes comportamientos
        user.showUserInfo();
        userOther.showUserInfo();

        //Clases anonimas
        User usuarioAnonimo = new User("dan","dan@d.com") {
            @Override
            public void showUserInfo() {
                System.out.println("soy una clase anónima solo me emplearé en este momento");
            }
        };
        usuarioAnonimo.showUserInfo();
    }
}