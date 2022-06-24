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
    // condicion que me indique si ageValidar tiene comillas al incio y al final
    if (ageValidar.startsWith("\"") && ageValidar.endsWith("\"")) {
      // obtener lo que esta entre comillas
      ageValidar = ageValidar.substring(1, ageValidar.length() - 1);
    } // condicion si solo empieza con comillas, obtener lo que esta despues de las
      // comillas
    else if (ageValidar.startsWith("\"")) {
      ageValidar = ageValidar.substring(1, ageValidar.length());
    } // condicion si solo termina con comillas, obtener lo que esta antes de las
      // comillas
    else if (ageValidar.endsWith("\"")) {
      ageValidar = ageValidar.substring(0, ageValidar.length() - 1);
    }
    JOptionPane.showMessageDialog(null, "Edad válida" + ageValidar);
  }

  // metodo para definir la validez de la edad
  public static boolean valAge(String Age) {
    boolean respuesta = false;

    if (Age.matches(
        "^[\"]{0,1}[2]{1}[5-9]{1}[\"]{0,1}|[\"]{0,1}[3-5]{1}[0-9]{1}[\"]{0,1}|[\"]{0,1}[6]{1}[0]{1}[\"]{0,1}$")) {
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
