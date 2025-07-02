package modelo;

public class Inscripcion {

    private String dniAlumno;
    private String nombreMateria;

    public Inscripcion(String dniAlumno, String nombreMateria) {

        this.dniAlumno = dniAlumno;
        this.nombreMateria = nombreMateria;
    }

    public String getDniAlumno() {

        return dniAlumno;
    }

    public String getNombreMateria() {

        return nombreMateria;
    }

    @Override
    public String toString() {

        return dniAlumno + "," + nombreMateria;
    }
}