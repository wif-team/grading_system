package Login;

import javax.swing.JOptionPane;

public class Age {
  private String ageValidar;

  public void getDocentAge() {
    do { // ciclo para repetir en caso de no ser valido
      ageValidar = JOptionPane.showInputDialog(null, "Ingrese su edad (25-60)");
      if (ageValidar.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar una edad");
        continue; // condicion en caso de dejar en blanco
      }
      if (valAge(ageValidar) == false) { // condicion si sigue la regex
        JOptionPane.showMessageDialog(null, "La edad ingresada no es valida");
        try {
          if (Integer.parseInt(ageValidar) < 25 || Integer.parseInt(ageValidar) > 60) {
            JOptionPane.showMessageDialog(null, "Su edad no esta dentro del rango"); // condicion que le indica al
                                                                                     // usuario pq no es valido con
                                                                                     // respecto al rango
          }
        } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto"); // condicion que le indica al usuario que
                                                                          // ingreso datos erroneos
        }
      }
    } while (valAge(ageValidar) == false);
    JOptionPane.showMessageDialog(null, "Edad válida");
  }

  // metodo para definir la validez de la edad
  public static boolean valAge(String Age) {
    boolean respuesta = false;
    if (Age.matches("^[2]{1}[5-9]{1}|[3-5]{1}[0-9]{1}|[6]{1}[0]{1}$")) {
      respuesta = true;
    } else {
      respuesta = false;
    }
    return respuesta;
  }

  // metodo para retornar la edad a login
  public String getAge() {
    return ageValidar;
  }
}
