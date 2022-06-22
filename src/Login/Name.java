package Login;

import javax.swing.JOptionPane;

public class Name {

  private String username;

  public void showName() {
    String regexUsername = "^[A-Z]{1}[a-z]{1,}[\\-\\s][A-Z]{1}[a-z]{1,}$";
    String regexValidName = "^[A-Za-z\\s]{2,}$";
    boolean isValidName = false;
    do {
      username = JOptionPane.showInputDialog("Ingresa tu Nombre y Apelllido");
      if (username.trim().matches(regexUsername)) {
        JOptionPane.showMessageDialog(null, "Dato ingresado correctamente");
        isValidName = true;
      } else if (username.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio");
      } else if (!username.matches(regexValidName)) {
        JOptionPane.showMessageDialog(null, "Dato incorrecto, solo se puede ingresar letras");
      } else {
        JOptionPane.showMessageDialog(null,
            "Formato incorrecto, se debe ingresar con\nel siguiente formato: \n Nombre Apellido");
      }
    } while (!isValidName);

  }

}
