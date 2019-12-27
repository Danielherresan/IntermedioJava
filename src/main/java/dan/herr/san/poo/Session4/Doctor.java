package dan.herr.san.poo.Session4;

import java.util.ArrayList;
import java.util.Date;

//Clases
public class Doctor extends User {
    //Atributos
    //creando variable estatica

    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    /**
     * Método constructor de paciente
     * @param name
     * @param email
     */
    Doctor(String name, String email) {
        super(name,email);
        System.out.println(
                String.format("Yo %s me he graduado de medicina estoy listo para atender pacientes",
                        name));
        this.speciality =speciality;

    }
    // Comportamientos (métodos):
    public void showName() {
        System.out.println(
                String.format(
                        "Muy buenos días, soy el Doctor %s scuenteme que lo trae por acá", super.getName()));
    }


    ArrayList <AvailableAppointment>  availableAppointments = new ArrayList<>();

    /**
     * En esta función se llena la lista availableAppointments con objetos del tipo
     * del tipo AvailableAppointment de forma que creamos una lista con las citas
     * generadas
     * @param date fecha de reserva
     * @param time hora de reserva
     */
    public void  addAvailableAppointments (Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public  ArrayList <AvailableAppointment> getAvailableAppointments () {
        return availableAppointments;

    }
    /**
     * En esta clase se define la estructura que deben tener las citas agendas
     */
    public  static  class AvailableAppointment{
        private Date date;
        private  String time;

        /**
         * para crear una cita se pide la fecha y la hora
         * @param date fecha
         * @param time hora
         */
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    @Override
    public String toString() {

        return  "el nombre del usuario es : "+super.getName() + "\nsu email : " + super.getEmail()
        +"\nEs un usuario tipo doctor y su especialidad es : "+ this.speciality;
    }
}
