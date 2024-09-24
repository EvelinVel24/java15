public class Alumno extends Persona {
    private Profesor profesor;
    private String hobby;

    public Alumno(String nombre, String identificador, Profesor profesor, String hobby) {
        super(nombre, identificador);
        this.profesor = profesor;
        this.hobby = hobby;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public void leer() {
        System.out.println(nombre + " (Alumno) está leyendo bajo la supervisión de " + profesor.getNombre() + ".");
    }

    @Override
    public void realizarEjercicio() {
        System.out.println(nombre + " (Alumno) está realizando ejercicios de su hobby: " + hobby + ".");
    }
}

