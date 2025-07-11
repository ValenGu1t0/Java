package persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Manager para Files con todos los métodos base para los demas manager
public class FileManager {

    // Guarda una línea string al final del archivo
    public static void guardarLinea(String rutaArchivo, String linea) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.write(linea);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar en " + rutaArchivo + ": " + e.getMessage());
        }
    }

    // ---------------------------------------------------------------- //

    // Lee todas las líneas de un archivo y las devuelve en una lista
    public static List<String> leerLineas(String rutaArchivo) {

        List<String> lineas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer " + rutaArchivo + ": " + e.getMessage());
        }
        return lineas;
    }

    // ---------------------------------------------------------------- //

    // Reescribe la nueva version del archivo que lo invoca con los cambios efectuados
    public static void sobrescribirArchivo(String rutaArchivo, List<?> lineas) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Object linea : lineas) {
                writer.write(linea.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al sobrescribir en " + rutaArchivo + ": " + e.getMessage());
        }
    }
}