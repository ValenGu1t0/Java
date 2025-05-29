package modelo;

public class Alumno implements Humano {
    private String nombre;
    private String apellido;
    private String dni;

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + "," + apellido + "," + dni;
    }

}

