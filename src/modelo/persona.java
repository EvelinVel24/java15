public abstract class Persona {
    protected String nombre;
    protected String identificador;

    public Persona(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    // Métodos abstractos para implementar polimorfismo
    public abstract void leer();
    public abstract void realizarEjercicio();
}
