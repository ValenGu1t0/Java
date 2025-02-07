import java.io.File;

// Esta clase es la encargada de recorrer las carpetas, creando hilos o tareas para cada directorio encontrado

public class AlgoritmoBusqueda implements Runnable {

    private final File carpeta;
    private final String nombreArchivo;

    public AlgoritmoBusqueda(File carpeta, String nombreArchivo) {

        this.carpeta = carpeta;
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void run() {

        if (carpeta.isDirectory()) {

            File[] files = carpeta.listFiles();

            if (files != null) {

                for (File file : files) {

                    if (file.isDirectory()) {

                        System.out.println("Explorando subcarpeta: " + file.getAbsolutePath());
                        AdministradorHilos.submitTask(new AlgoritmoBusqueda(file, nombreArchivo));

                    } else { if (file.getName().equals(nombreArchivo)) {

                            System.out.println("!!!! ARCHIVO ENCONTRADO !!!! El archivo " + file.getName() + " se encuentra en la carpeta " + file.getAbsolutePath());
                            AdministradorHilos.stopAllTasks();
                            return;
                        }
                    }
                }
            }
        }
    }
}
