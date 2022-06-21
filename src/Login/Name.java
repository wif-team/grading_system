package Login;

import javax.swing.JOptionPane;

public class Name {
  void showName() {
    String username = "";
    String regexUsername = "^[a-zA-Z\\s]{2,}$";
    boolean isUsernameValid = false;
    do {
      username = JOptionPane.showInputDialog("Ingresa tu Nombre y Apellido");

    } while (!isUsernameValid);
  }
}
