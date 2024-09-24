
public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, String identificador, String especialidad) {
        super(nombre, identificador);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void leer() {
        System.out.println(nombre + " (Profesor) está leyendo material de " + especialidad + ".");
    }

    @Override
    public void realizarEjercicio() {
        System.out.println(nombre + " (Profesor) está realizando ejercicios de " + especialidad + ".");
    }
}
