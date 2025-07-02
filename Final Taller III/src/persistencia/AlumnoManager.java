package persistencia;

import modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoManager {

    // Import del alumnos.txt
    private static final String RUTA_ARCHIVO = "data/alumnos.txt";


    // Guarda un alumno nuevo en alumnos.txt
    public static void guardarAlumno(Alumno alumno) {
        FileManager.guardarLinea(RUTA_ARCHIVO, alumno.toString());
    }

    // ---------------------------------------------------------------- //

    // Metodo que lee y devuelve todos los alumnos del archivo
    public static List<Alumno> leerAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();
        List<String> lineas = FileManager.leerLineas(RUTA_ARCHIVO);

        for (String linea : lineas) {
            String[] partes = linea.split(",");

            // Solo aquellos Alumnos que tengan los datos completos
            if (partes.length == 3) {
                String nombre = partes[0];
                String apellido = partes[1];
                String dni = partes[2];
                alumnos.add(new Alumno(nombre, apellido, dni));
            }
        }
        return alumnos;
    }

    // ---------------------------------------------------------------- //

    // Metodo que busca alumno por DNI - necesario para el login
    public static Alumno buscarAlumnoPorDni(String dni) {

        List<Alumno> alumnos = leerAlumnos();

        for (Alumno a : alumnos) {
            if (a.getDni().equals(dni)) {
                return a;
            }
        }
        return null;
    }
}