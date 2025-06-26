package modelo;

public class Materia {

    private String nombre;
    private String codigo;
    private String dniProfesor;     // dni del profe que la imparte

    public Materia(String nombre, String codigo, String dniProfesor) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.dniProfesor = dniProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDniProfesor() {
        return dniProfesor;
    }

    @Override
    public String toString() {
        return nombre + "," + codigo + "," + dniProfesor;
    }
}
