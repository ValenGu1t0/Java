package modelo;

public class Materia {
    private String nombre;
    private String codigo;
    private String profesorDni; // El DNI del profesor que la imparte

    public Materia(String nombre, String codigo, String profesorDni) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesorDni = profesorDni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProfesorDni() {
        return profesorDni;
    }

    @Override
    public String toString() {
        return nombre + "," + codigo + "," + profesorDni;
    }
}
