import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Esta clase es la encargada de invocar hilos cada vez que se busque en una nueva carpeta. Se limitó a 5 hilos.

public class AdministradorHilos {

    // Creamos el pool de 5 hilos
    private static final ExecutorService executor = Executors.newFixedThreadPool(5);

    // Genera un nuevo hilo para buscar si no se encuentra el archivo en la carpeta x
    public static void submitTask(Runnable task) {

        System.out.println("Nueva tarea creada");
        executor.submit(task);
    }

    // Si encuentra el archivo shuteamos down
    public static void stopAllTasks() {

        System.out.println("Deteniendo todas las tareas...");
        executor.shutdownNow();
    }
}

