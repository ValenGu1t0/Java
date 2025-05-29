import modelo.Alumno;
import persistencia.AlumnoManager;
import ui.LoginFrame;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Crear alumno (solo una vez)
        Alumno alumno = new Alumno("Lucas", "Gómez", "12345678");
        AlumnoManager.guardarAlumno(alumno); */

        // Leer alumnos
        List<Alumno> alumnos = AlumnoManager.leerAlumnos();

        // Mostrar por consola
        System.out.println("Alumnos en archivo:");
        for (Alumno e : alumnos) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - DNI: " + e.getDni());
        }

        // Lanzar interfaz gráfica
        javax.swing.SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        }); // <-- faltaba cerrar este paréntesis
    }
}


