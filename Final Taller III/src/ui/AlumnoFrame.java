package ui;

import modelo.Alumno;
import modelo.Materia;
import modelo.Inscripcion;
import persistencia.MateriaManager;
import persistencia.InscripcionManager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AlumnoFrame extends JFrame {

    private Alumno alumno;
    private JComboBox<String> comboMaterias;
    private JButton inscribirseBtn;
    private JTextArea areaInscripciones;

    public AlumnoFrame(Alumno alumno) {

        this.alumno = alumno;

        setTitle("Panel del Alumno - " + alumno.getNombre());
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        initComponents();
        cargarMaterias();
        mostrarInscripciones();
    }

    // ---------------------------------------------------------------------------------------- //

    private void initComponents() {

        comboMaterias = new JComboBox<>();
        inscribirseBtn = new JButton("Inscribirse");
        areaInscripciones = new JTextArea();
        areaInscripciones.setEditable(false);

        inscribirseBtn.addActionListener(e -> inscribirse());

        JPanel panelTop = new JPanel(new BorderLayout());
        panelTop.add(new JLabel("Materias disponibles:"), BorderLayout.NORTH);
        panelTop.add(comboMaterias, BorderLayout.CENTER);
        panelTop.add(inscribirseBtn, BorderLayout.EAST);

        setLayout(new BorderLayout());
        add(panelTop, BorderLayout.NORTH);
        add(new JScrollPane(areaInscripciones), BorderLayout.CENTER);
    }

    // ---------------------------------------------------------------------------------------- //

    private void cargarMaterias() {

        List<Materia> materias = MateriaManager.leerMaterias();

        for (Materia m : materias) {
            comboMaterias.addItem(m.getNombre());
        }
    }

    // ---------------------------------------------------------------------------------------- //

    private void inscribirse() {
        String materiaSeleccionada = (String) comboMaterias.getSelectedItem();

        if (materiaSeleccionada != null) {
            // Verificar si ya está inscripto
            List<Inscripcion> inscripciones = InscripcionManager.leerInscripciones();
            for (Inscripcion i : inscripciones) {
                if (i.getDniAlumno().equals(alumno.getDni()) && i.getNombreMateria().equals(materiaSeleccionada)) {
                    JOptionPane.showMessageDialog(this, "Ya estás inscripto en esa materia.");
                    return;
                }
            }

            // Si no está inscripto, lo guarda
            Inscripcion inscripcion = new Inscripcion(alumno.getDni(), materiaSeleccionada);
            InscripcionManager.guardarInscripcion(inscripcion);
            JOptionPane.showMessageDialog(this, "Inscripción exitosa a " + materiaSeleccionada);
            mostrarInscripciones();
        }
    }

    // ---------------------------------------------------------------------------------------- //

    private void mostrarInscripciones() {

        List<Inscripcion> inscripciones = InscripcionManager.leerInscripciones();
        areaInscripciones.setText("Materias inscriptas:\n");

        for (Inscripcion i : inscripciones) {
            if (i.getDniAlumno().equals(alumno.getDni())) {
                areaInscripciones.append("- " + i.getNombreMateria() + "\n");
            }
        }
    }
}
