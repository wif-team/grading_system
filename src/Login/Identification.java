package Login;

import javax.swing.JOptionPane;

public class Identification {
  private String user_identification;

  public void showIdentification() {
    String regexIdentification = "^[0-9]{9}[-]?[0-9]{1}$";
    String regexValidation = "^[0-9]{10}$";
    boolean isValidIdentification = false;
    do {
      user_identification = JOptionPane.showInputDialog("Ingresa tu numero de identificacion");
      if (user_identification.trim().matches(regexIdentification)) {
        JOptionPane.showMessageDialog(null, "Dato ingresado correctamente");
        isValidIdentification = true;
      } else if (user_identification.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "El numero de identificacion no puede estar vacio");
      } else if (!user_identification.matches(regexValidation)) {
        JOptionPane.showMessageDialog(null, "Dato incorrecto, solo se puede ingresar numeros");
      } else {
        JOptionPane.showMessageDialog(null,
            "Formato incorrecto, se debe ingresar con\nel siguiente formato: \n 9999999-9");
      }
    } while (!isValidIdentification);

  }
}
