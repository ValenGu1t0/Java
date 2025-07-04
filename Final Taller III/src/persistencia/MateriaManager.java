package persistencia;

import modelo.Materia;
import java.util.ArrayList;
import java.util.List;

public class MateriaManager {

    private static final String RUTA_ARCHIVO = "data/materias.txt";

    // ---------------------------------------------------------------- //

    public static List<Materia> leerMaterias() {

        List<Materia> materias = new ArrayList<>();
        List<String> lineas = FileManager.leerLineas(RUTA_ARCHIVO);

        for (String linea : lineas) {

            String[] partes = linea.split(",");

            if (partes.length == 3) {
                String nombre = partes[0];
                String codigo = partes[1];
                String profesorDni = partes[2];
                materias.add(new Materia(nombre, codigo, profesorDni));
            }
        }
        return materias;
    }

    // ---------------------------------------------------------------- //

    public static Materia buscarMateriaPorProfesorDni(String profesorDni) {

        for (Materia m : leerMaterias()) {
            if (m.getDniProfesor().equals(profesorDni)) {
                return m;
            }
        }
        return null;
    }
}