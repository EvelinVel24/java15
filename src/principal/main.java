import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un profesor
        Profesor profesor = new Profesor("Dr. Smith", "PROF001", "Matemáticas");

        // Crear alumnos
        Alumno alumno1 = new Alumno("Juan Pérez", "ALUM001", profesor, "Ajedrez");
        Alumno alumno2 = new Alumno("María López", "ALUM002", profesor, "Fútbol");
        Alumno alumno3 = new Alumno("Pedro Martínez", "ALUM003", profesor, "Lectura");

        // Lista para almacenar a todos los participantes del curso
        List<Persona> curso = new ArrayList<>();
        curso.add(profesor);
        curso.add(alumno1);
        curso.add(alumno2);
        curso.add(alumno3);

        // Mostrar la lista de personas en el curso
        System.out.println("Lista de participantes del curso:");
        for (Persona persona : curso) {
            System.out.println("Nombre: " + persona.getNombre() + ", Identificador: " + persona.getIdentificador());
            persona.leer();
            persona.realizarEjercicio();
            System.out.println();
        }
    }
}
