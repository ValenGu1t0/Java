package ui;

import modelo.Alumno;
import modelo.Materia;
import modelo.Profesor;
import modelo.Inscripcion;
import persistencia.MateriaManager;
import persistencia.InscripcionManager;
import persistencia.AlumnoManager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static persistencia.MateriaManager.buscarMateriaPorProfesorDni;

public class ProfesorFrame extends JFrame {

    private Profesor profesor;
    private JTextArea areaInfo;

    public ProfesorFrame(Profesor profesor) {

        this.profesor = profesor;

        setTitle("Panel del Profesor - " + profesor.getNombre() + " " + profesor.getApellido());
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        areaInfo = new JTextArea();
        areaInfo.setEditable(false);
        add(new JScrollPane(areaInfo));

        mostrarMateriaYAlumnos();
    }

    // ---------------------------------------------------------------------------------------- //

    private void mostrarMateriaYAlumnos() {

        Materia materia = buscarMateriaPorProfesorDni(profesor.getDni());

        if (materia == null) {
            areaInfo.setText("No se encontró ninguna materia asociada al profesor.");
            return;
        }

        areaInfo.setText("Materia: " + materia.getNombre() + "\n\nAlumnos inscriptos:\n");

        List<Inscripcion> inscripciones = InscripcionManager.leerInscripciones();
        List<Alumno> alumnos = AlumnoManager.leerAlumnos();

        for (Inscripcion insc : inscripciones) {
            if (insc.getNombreMateria().equals(materia.getNombre())) {
                // Buscar datos del alumno
                for (Alumno a : alumnos) {
                    if (a.getDni().equals(insc.getDniAlumno())) {
                        areaInfo.append("- " + a.getNombre() + " " + a.getApellido() + " (DNI: " + a.getDni() + ")\n");
                    }
                }
            }
        }
    }
}
