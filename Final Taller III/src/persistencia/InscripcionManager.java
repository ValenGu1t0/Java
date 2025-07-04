package persistencia;

import modelo.Inscripcion;
import java.util.ArrayList;
import java.util.List;

public class InscripcionManager {

    private static final String RUTA_ARCHIVO = "data/inscripciones.txt";

    // Guarda una nueva inscripción
    public static void guardarInscripcion(Inscripcion inscripcion) {
        FileManager.guardarLinea(RUTA_ARCHIVO, inscripcion.toString());
    }

    // ---------------------------------------------------------------- //

    public static List<Inscripcion> leerInscripciones() {

        List<Inscripcion> inscripciones = new ArrayList<>();
        List<String> lineas = FileManager.leerLineas(RUTA_ARCHIVO);

        for (String linea : lineas) {

            String[] partes = linea.split(",");

            if (partes.length == 2) {
                String alumnoDni = partes[0];
                String materiaCodigo = partes[1];
                inscripciones.add(new Inscripcion(alumnoDni, materiaCodigo));
            }
        }
        return inscripciones;
    }

    // ---------------------------------------------------------------- //

    // Permite eliminar una materia desde el panel de alumno
    public static void eliminarInscripcion(String dniAlumno, String nombreMateria) {
        List<Inscripcion> inscripciones = leerInscripciones();
        List<Inscripcion> actualizadas = new ArrayList<>();

        for (Inscripcion i : inscripciones) {
            if (!(i.getDniAlumno().equals(dniAlumno) && i.getNombreMateria().equals(nombreMateria))) {
                actualizadas.add(i);
            }
        }

        // Llama al metodo sobrescribirArchivo con el nuevo contenido
        FileManager.sobrescribirArchivo(RUTA_ARCHIVO, actualizadas);
    }

    // ---------------------------------------------------------------- //

    // Metodo para limitar las inscripciones
    public static int contarInscriptos(String nombreMateria) {

        int count = 0;

        List<Inscripcion> inscripciones = leerInscripciones();

        for (Inscripcion insc : inscripciones) {
            if (insc.getNombreMateria().equals(nombreMateria)) {
                count++;
            }
        }
        return count;
    }
}