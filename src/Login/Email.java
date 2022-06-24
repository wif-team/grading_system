package Login;

import javax.swing.JOptionPane;

public class Email {
  private String email;

  public String getEmail() {
    return email;
  }

  void getDocentEmail() {
    String patron = "^[a-z0-9+]+@(uta.edu.ec)$";
    boolean email_valid = false;
    do {
      email = JOptionPane.showInputDialog("Ingrese su direccion de correo");
      if (email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese informacion");
        continue;
      } else if (!email.trim().matches(patron)) {
        JOptionPane.showMessageDialog(null, "Ingrese correctamente el correo\nEjemplo: dgonzales7414@uta.edu.ec");
        continue;
      } else if (email.trim().matches(patron)) {
        JOptionPane.showMessageDialog(null, "Correo ingresado correctamente");
        email_valid = true;
        continue;
      } else {
        JOptionPane.showMessageDialog(null, "Correo ingresado incorrectamente\nEjemplo: dgonzales7417@uta.edu.ec");
      }
    } while (!email_valid);
  }
}
