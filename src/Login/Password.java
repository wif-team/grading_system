package Login;

import javax.swing.JOptionPane;

public class Password {
  public void showPassword() {
    // Contrasena donde la unica condicion es que tenga mas de 10 caracteres (no
    // puede contener espacios)
    String user_password;
    boolean validez = true;
    do {

      user_password = JOptionPane.showInputDialog(null, "Ingrese su contrasena");
      validez = valpassword(user_password);

      if (validez == false && user_password.contains(" ")) {
        JOptionPane.showMessageDialog(null, "La contraseña no debe contener espacios y tener 10 o mas caracteres");

      } else if (validez == false) {
        JOptionPane.showMessageDialog(null, "La contrasena debe de contener 10 caracteres");

      } else {
        if (user_password.contains(" ")) {
          JOptionPane.showMessageDialog(null, "La contraseña no debe contener espacios");
          validez = false;
        }
      }

    } while (validez == false);

    JOptionPane.showMessageDialog(null, validez);

  }

  // Metodo que determina si cumple con los 10 caracteres
  public static boolean valpassword(String user_password) {
    return user_password.matches("^.{10,}$");
  }
}
