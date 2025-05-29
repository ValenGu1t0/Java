package persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    // Guarda una línea (ej: un alumno convertido en string) al final del archivo
    public static void guardarLinea(String rutaArchivo, String linea) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.write(linea);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar en " + rutaArchivo + ": " + e.getMessage());
        }
    }

    // Lee todas las líneas del archivo y las devuelve en una lista
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

    // Sobrescribe todo el archivo con una lista de lineas (para modificar o eliminar datos)
    public static void sobrescribirArchivo(String rutaArchivo, List<String> lineas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al sobrescribir " + rutaArchivo + ": " + e.getMessage());
        }
    }
}

