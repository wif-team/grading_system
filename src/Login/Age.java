package Login;

import javax.swing.JOptionPane;

public class Age {

  public String getDocentAge() {
    String age;

    do { // ciclo para repetir en caso de no ser valido
      age = JOptionPane.showInputDialog(null, "Ingrese su edad (25-60)");

      if (age.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar una edad");
        continue; // condicion en caso de dejar en blanco
      }

      if (valAge(age) == false) { // condicion si sigue la regex
        JOptionPane.showMessageDialog(null, "La edad ingresada no es valida");

        try {

          if (Integer.parseInt(age) < 25 || Integer.parseInt(age) > 60) {
            JOptionPane.showMessageDialog(null, "Su edad no esta dentro del rango"); // condicion que le indica al
                                                                                     // usuario pq no es valido con
                                                                                     // respecto al rango
          }

        } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto"); // condicion que le indica al usuario que
                                                                          // ingreso datos erroneos
        }
      }

    } while (valAge(age) == false);

    // condiciones por si es introducido con comillas
    if (age.startsWith("\"") && age.endsWith("\"")) {

      age = age.substring(1, age.length() - 1);
    }

    else if (age.startsWith("\"")) {
      age = age.substring(1, age.length());
    }

    else if (age.endsWith("\"")) {
      age = age.substring(0, age.length() - 1);
    }
    JOptionPane.showMessageDialog(null, "Edad válida");

    return age;

  }

  // metodo para definir la validez de la edad
  public static boolean valAge(String Age) {

    boolean respuesta = false;

    if (Age.matches(
        "^[\"]?[2][5-9][\"]?|[\"]?[3-5][0-9][\"]?|[\"]?[6][0][\"]?$")) {
      respuesta = true;
    } else {
      respuesta = false;
    }
    return respuesta;
  }

}
