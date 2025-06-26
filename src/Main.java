import modelo.Alumno;
import persistencia.AlumnoManager;
import ui.LoginFrame;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Leer alumnos
        List<Alumno> alumnos = AlumnoManager.leerAlumnos();

        // Listado de alumnos por consola
        System.out.println("Alumnos en archivo:");
        for (Alumno e : alumnos) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - DNI: " + e.getDni());
        }

        // Interfaz gráfica
        javax.swing.SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        });
    }
}


