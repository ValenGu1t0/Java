package persistencia;

import modelo.Inscripcion;
import java.util.ArrayList;
import java.util.List;

public class InscripcionManager {

    private static final String RUTA_ARCHIVO = "data/inscripciones.txt";

    public static void guardarInscripcion(Inscripcion inscripcion) {
        FileManager.guardarLinea(RUTA_ARCHIVO, inscripcion.toString());
    }

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

    public static List<Inscripcion> obtenerInscripcionesPorAlumno(String alumnoDni) {

        List<Inscripcion> resultado = new ArrayList<>();

        for (Inscripcion i : leerInscripciones()) {

            if (i.getDniAlumno().equals(alumnoDni)) {
                resultado.add(i);
            }
        }
        return resultado;
    }
}
