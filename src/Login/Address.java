package Login;

import javax.swing.JOptionPane;

public class Address {

  public String getDocentAddress() {
    boolean validAddress = false;
    String user_address;
    String avenida;
    String calle;
    String numero;
    String ciudad;

    do {
      avenida = JOptionPane.showInputDialog("Ingrese la avenida");

      if (valaddress(avenida) == true) {
        validAddress = true;

      } else {
        JOptionPane.showMessageDialog(null, "Avenida invalida");
        validAddress = false;
      }

    } while (validAddress == false);

    do {

      calle = JOptionPane.showInputDialog("Ingrese la calle");

      if (valaddress(calle) == true) {
        validAddress = true;

      } else {
        JOptionPane.showMessageDialog(null, "Calle invalida");
        validAddress = false;
      }

    } while (validAddress == false);

    do {

      numero = JOptionPane.showInputDialog("Ingrese el numero");
      if (valaddress2(numero) == true) {
        validAddress = true;

      } else {
        JOptionPane.showMessageDialog(null, "Numero de casa invalido");
        validAddress = false;
      }

    } while (validAddress == false);
    do {

      ciudad = JOptionPane.showInputDialog("Ingrese la ciudad");
      if (valaddress(ciudad) == true) {
        validAddress = true;

      } else {
        JOptionPane.showMessageDialog(null, "Ciudad invalida");
        validAddress = false;
      }

    } while (validAddress == false);

    JOptionPane.showMessageDialog(null, "Direccion valida");
    user_address = "Av." + avenida + " y " + calle + " " + numero + " " + ciudad;
    JOptionPane.showMessageDialog(null, user_address);

    return user_address;

  }

  // funcion regex para validar la direccion
  public static boolean valaddress(String dir) {
    return dir.matches("^[a-zA-z]{1,}$");
  }

  public static boolean valaddress2(String dir2) {
    return dir2.matches("^[0-9]{0,4}$");
  }

}
