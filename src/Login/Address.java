package Login;

import javax.swing.JOptionPane;

public class Address {

  private String user_address;

  public void getDocentAddress() {
    // repetir en caso de que el usuario ingrese una direccion invalida
    boolean validAddress = false;
    do {
      // create a new JOptionPane object to get data from the user
      String user_address = JOptionPane.showInputDialog(null,
          "Ingrese su direccion(Avenida/ calle / numero de casa/ Pais)");
      // crear un JOptionPane para mostrar user_address
      if (valaddress(user_address) == false) {
        JOptionPane.showMessageDialog(null, "Direccion invalida");
        validAddress = false;
      } else {
        JOptionPane.showMessageDialog(null, "Direccion: " + user_address);
        validAddress = true;
      }
    } while (validAddress == false);
  }

  // metodo regex para validar la direccion
  public static boolean valaddress(String user_address) {
    return user_address.matches("^[a-zA-z]{1,}[\\/]{1}[a-zA-z]{1,}[\\/]{1}[0-9]{0,4}[\\/]{1}[a-zA-z]{1,}$");
  }

  public String getAddress() {
    return user_address;
  }

}
