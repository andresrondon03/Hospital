import handler.Handler;

import concrete.*;
import support.Request;
import support.RequestType;

public class Main {
    public static void main(String[] args) {
        Handler recepcionista = new Recepcionist();
        Handler enfermera = new Nurse();
        Handler doctor = new Doctor();
        Handler especialista = new Specialist();
        Handler director = new Director();

        recepcionista.setNext(enfermera);
        enfermera.setNext(doctor);
        doctor.setNext(especialista);
        especialista.setNext(director);

        Request [] requests = {
            new Request(RequestType.NURSE, "Ayuda, mi amigo necesita primeros auxilios"),
            new Request(RequestType.DIRECTOR, "Reclamo administrativo"),
            new Request(RequestType.SPECIALIST, "Necesito una consulta con el especialista"),
            new Request(RequestType.RECEPCIONIST, "Necesito un certificado, por favor"),
            new Request(RequestType.DOCTOR, "Tengo fiebre y necesito una revisión"),
        };

        for (Request req : requests){
            System.out.println("Procesando: " + req);
            recepcionista.handleRequest(req);
            System.out.println();
        }
    }
}
