package Login;

import javax.swing.JOptionPane;

public class Faculty {
    private String faculty;

    public String getFaculty() {
        return faculty;
    }

    void VerifyFaculty() {
        String faculty;
        boolean valid = true;
        boolean tiene_numeros = false;
        int[] num = new int[10];
        int[] numer = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = i;
            numer[i] = i;
        }
        do {
            faculty = JOptionPane.showInputDialog("Ingrese la facultad");

            char[] letras = new char[faculty.length()];
            for (int i = 0; i < faculty.length(); i++) {
                letras[i] = faculty.charAt(i);
            }
            if (faculty.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese la facultad");
                valid = false;
                continue;
            }
            if (faculty.length() < 5) {
                JOptionPane.showMessageDialog(null, "La facultad debe contener 5 o más caracteres");
                valid = false;
            }
            if (letras[0] == ' ' || letras[faculty.length() - 1] == ' ') {
                JOptionPane.showMessageDialog(null, "No debe contener espacios al inicio o final");
                valid = false;
                continue;
            }
            for (int i = 0; i < faculty.length(); i++) {
                for (int j = 0; j < 10; j++) {
                    if (letras[i] == numer[j]) {
                        valid = false;
                        tiene_numeros = true;
                        continue;
                    }
                }
                if (letras[i] == 32 && letras[i + 1] == 32) {
                    JOptionPane.showMessageDialog(null, "No debe escribir espacios seguidos");
                    valid = false;
                }
            }
            if (tiene_numeros == true) {
                JOptionPane.showMessageDialog(null, "No debe contener numeros");
            }
        } while (valid == false);
        JOptionPane.showMessageDialog(null, "Facultad correcta");

    }
}
