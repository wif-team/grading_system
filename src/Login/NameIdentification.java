package Login;

import javax.swing.JOptionPane;

public class NameIdentification {
  void showNameIdentification() {
    String username = "";
    String identification = "";
    String regexUsername = "^[a-zA-Z\\s]{2,}$";
    String regexIdentification = "^[0-9]{10}$";
    boolean isUsernameValid = false;
    boolean isIdentificationValid = false;
    do {
      username = JOptionPane.showInputDialog("Ingresa tu Nombre y Apellido");

    } while (!isUsernameValid);
  }
}
