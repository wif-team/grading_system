package Login;

import javax.swing.JOptionPane;

public class Password {
  private String user_password;

  public String getPassword() {
    return user_password;
  }

  void showPassword() {
    // Contrasena donde la unica condicion es que tenga mas de 10 caracteres (no
    // puede contener espacios)
    String user_password;
    boolean validez = true;
    do {

      user_password = JOptionPane.showInputDialog(null, "Ingrese su contrasena");
      validez = valpassword(user_password);

      if (user_password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debes ingresar caracteres");
        continue;
      }

      if (validez == false && user_password.contains(" ")) {
        JOptionPane.showMessageDialog(null, "La contraseña no debe contener espacios y tener 10 caracteres");

      } else if (validez == false) {
        JOptionPane.showMessageDialog(null, "La contrasena debe de contener 10 caracteres");

      } else {
        if (user_password.contains(" ")) {
          JOptionPane.showMessageDialog(null, "La contraseña no debe contener espacios");
          validez = false;
        }
      }

    } while (validez == false);

    JOptionPane.showMessageDialog(null, "Contraseña válida");

  }

  // Metodo que determina si cumple con los 10 caracteres
  public static boolean valpassword(String user_password) {
    return user_password.matches("^.{10}$");
  }
}
