package Login;

import javax.swing.JOptionPane;

public class Email {

  public String getDocentEmail() {

    String email;
    String patron = "^[a-z]+[0-9]+@(uta.edu.ec)$"; // Patron para el correo electronico
    boolean email_valid = false;

    do {
      email = JOptionPane.showInputDialog("Ingrese su direccion de correo");

      if (email.isEmpty()) { // Repite si no se ingresa informacion
        JOptionPane.showMessageDialog(null, "Ingrese informacion");
        continue;

      } else if (!email.trim().toLowerCase().matches(patron)) { // Detecta si no encaja con el patron del correo
        JOptionPane.showMessageDialog(null, "Ingrese correctamente el correo\nEjemplo: dgonzales7414@uta.edu.ec");
        continue;

      } else if (email.trim().toLowerCase().matches(patron)) { // Detecta si encaja con el patron del correo
        JOptionPane.showMessageDialog(null, "Correo ingresado correctamente");
        email_valid = true;
        continue;

      } else { // En el caso que no entre a ninguna validacion
        JOptionPane.showMessageDialog(null, "Correo ingresado incorrectamente\nEjemplo: dgonzales7417@uta.edu.ec");
      }

    } while (!email_valid);

    return email;
  }
}
