
import java.io.File;

/*  TP Regularizador Taller III - Búsqueda de archivo en disco con threads  */

public class Main {

    public static void main(String[] args) {

        System.out.println("Empieza la búsqueda..");

        // Indica el path a partir del cual empieza la búsqueda (editable) - atento al / o \
        String path = "C:\\Users\\Valentino\\Desktop";

        // Indica el archivo a buscar (editable)
        String archivo = "tesoro.txt";

        // Llamamos al metodo de la clase FileSearchManager
        AdministradorHilos.submitTask(new AlgoritmoBusqueda(new File(path), archivo));
    }
}
