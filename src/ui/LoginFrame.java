package ui;

import modelo.Alumno;
import modelo.Profesor;
import persistencia.AlumnoManager;
import persistencia.ProfesorManager;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField dniField;
    private JButton loginAlumnoBtn;
    private JButton loginProfesorBtn;

    public LoginFrame() {

        setTitle("Login - Sistema de Gestión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null); // Centra la ventana

        initComponents();
    }

    private void initComponents() {

        JLabel dniLabel = new JLabel("DNI:");
        dniField = new JTextField(15);

        loginAlumnoBtn = new JButton("Ingresar como Alumno");
        loginProfesorBtn = new JButton("Ingresar como Profesor");

        loginAlumnoBtn.addActionListener(e -> loginComoAlumno());
        loginProfesorBtn.addActionListener(e -> loginComoProfesor());

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(dniLabel);
        panel.add(dniField);
        panel.add(loginAlumnoBtn);
        panel.add(loginProfesorBtn);

        add(panel);
    }


    // ---------------------------------------------------------------------------------------- //


    private void loginComoAlumno() {

        String dni = dniField.getText().trim();
        Alumno alumno = AlumnoManager.buscarAlumnoPorDni(dni);

        if (alumno != null) {
            JOptionPane.showMessageDialog(this, "¡Bienvenido, " + alumno.getNombre() + "!");
            new AlumnoFrame(alumno).setVisible(true); // 👈 Agrega esto
        } else {
            JOptionPane.showMessageDialog(this, "Alumno no encontrado.");
        }
    }

    // ---------------------------------------------------------------------------------------- //


    private void loginComoProfesor() {

        String dni = dniField.getText().trim();
        Profesor profesor = ProfesorManager.buscarProfesorPorDni(dni);

        if (profesor != null) {
            JOptionPane.showMessageDialog(this, "¡Bienvenido, Prof. " + profesor.getNombre() + "!");
            this.dispose();
            new ProfesorFrame(profesor).setVisible(true); // Abre ventana del profesor
        } else {
            JOptionPane.showMessageDialog(this, "Profesor no encontrado.");
        }
    }

}

