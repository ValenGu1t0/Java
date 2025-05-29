package persistencia;

import modelo.Profesor;

import java.util.ArrayList;
import java.util.List;

public class ProfesorManager {

    private static final String RUTA_ARCHIVO = "data/profesores.txt";

    // Guarda un profesor en el archivo
    public static void guardarProfesor(Profesor profesor) {
        FileManager.guardarLinea(RUTA_ARCHIVO, profesor.toString());
    }

    // ---------------- //

    // Metodo que lee y devuelve todos los profesores del archivo
    public static List<Profesor> leerProfesor() {
        List<Profesor> profesores = new ArrayList<>();
        List<String> lineas = FileManager.leerLineas(RUTA_ARCHIVO);

        for (String linea : lineas) {
            String[] partes = linea.split(",");
            if (partes.length == 3) {
                String nombre = partes[0];
                String apellido = partes[1];
                String dni = partes[2];
                profesores.add(new Profesor(nombre, apellido, dni));
            }
        }
        return profesores;
    }

    // ---------------- //

    // Metodo que busca profesor por DNI
    public static Profesor buscarProfesorPorDni(String dni) {
        List<Profesor> profesores = leerProfesor();
        for (Profesor p : profesores) {
            if (p.getDni().equals(dni)) {
                return p;
            }
        }
        return null;
    }

}
