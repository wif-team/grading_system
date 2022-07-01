package Login;

import javax.swing.JOptionPane;

public class Faculty {

    public String getDocentFaculty() {
        String faculty;
        String facultad_completa = "^(FACULTAD DE )[A-ZÁÉÍÓÚÑ]+\\s[A-ZÁÉÍÓÚÑ]*\\s?"// Creacion de patron para la
                                                                                   // facultad completa
                + "[A-ZÁÉÍÓÚÑ]*\\s?[A-ZÁÉÍÓÚÑ]*\\s?[A-ZÁÉÍÓÚÑ]*\\s?[A-ZÁÉÍÓÚÑ]+$";
        String facultad_abreviada = "^(F)[A-Z]+";// Creacion de patron para la facultad abreviada
        boolean faculty_valid = false;

        do {
            faculty = JOptionPane.showInputDialog("Ingrese su facultad");

            if (faculty.isEmpty()) {// Repite si no se ingresa informacion
                JOptionPane.showMessageDialog(null, "Ingrese informacion");
                continue;

            } else if (!faculty.trim().toUpperCase().matches(facultad_completa) && // Detecta si no encaja con el patron
                                                                                   // de la facultad
                    !faculty.trim().toUpperCase().matches(facultad_abreviada)) { // completa y abreviada
                JOptionPane.showMessageDialog(null, "Ingrese correctamente la facultad"
                        + "\nEjemplo: Facultad de Ciencias Administrativas o FCA");
                continue;

            } else if (faculty.trim().toUpperCase().matches(facultad_completa) || // Detecta si encaja con el patron de
                                                                                  // la facultad
                    faculty.trim().toUpperCase().matches(facultad_abreviada)) { // completa o abreviada
                JOptionPane.showMessageDialog(null, "Facultad ingresado correctamente");
                faculty_valid = true;
                continue;

            } else { // En el caso que no entre a ninguna validacion
                JOptionPane.showMessageDialog(null,
                        "Facultad ingresado incorrectamente\nEjemplo: Facultad de Ciencias Administrativas o FCA");
            }

        } while (!faculty_valid);

        return faculty;
    }
}
