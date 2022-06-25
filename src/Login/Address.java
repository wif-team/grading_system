package Login;

import javax.swing.JOptionPane;

public class Address {

  private String user_address;

  public void getDocentAddress() {
    // repetir en caso de que el usuario ingrese una direccion invalida
    boolean validAddress = false;
    String avenida;
    String calle;
    String numero;
    String ciudad;
    do {
      // JOptionPane.showInputDialog("Ingrese la avenida");
      avenida = JOptionPane.showInputDialog("Ingrese la avenida");
      // condicion si avenida coincide con valaddress
      if (valaddress(avenida) == true) {
        validAddress = true;
      } else {
        JOptionPane.showMessageDialog(null, "Avenida invalida");
      }

      // asiganar el valor de la calle a la variable calle
      calle = JOptionPane.showInputDialog("Ingrese la calle");
      if (valaddress(calle) == true) {
        validAddress = true;
      } else {
        JOptionPane.showMessageDialog(null, "Calle invalida");
      }
      // asiganar el valor del numero a la variable numero
      numero = JOptionPane.showInputDialog("Ingrese el numero");
      if (valaddress2(numero) == true) {
        validAddress = true;
      } else {
        JOptionPane.showMessageDialog(null, "Numero de casa invalido");
      }
      // asiganar el valor de la ciudad a la variable ciudad
      ciudad = JOptionPane.showInputDialog("Ingrese la ciudad");
      if (valaddress(ciudad) == true) {
        validAddress = true;
      } else {
        JOptionPane.showMessageDialog(null, "Ciudad invalida");
      }
    } while (validAddress == false);
    JOptionPane.showMessageDialog(null, "Direccion valida");
    // asignar el valor de la direccion a la variable user_address
    user_address = "Av." + avenida + " y " + calle + " " + numero + " " + ciudad;
    JOptionPane.showMessageDialog(null, user_address);

  }

  // metodo regex para validar la direccion
  public static boolean valaddress(String dir) {
    return dir.matches("^[a-zA-z]{1,}$");
  }

  public static boolean valaddress2(String dir2) {
    return dir2.matches("^[0-9]{0,4}$");
  }

  public String getAddress() {
    return user_address;
  }

}
