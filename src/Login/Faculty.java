package Login;

import javax.swing.JOptionPane;

public class Faculty {
    private String faculty;

    public String getFaculty() {
        return faculty;
    }

    void VerifyFaculty() {
        String faculty;
        boolean valid;                                  //Boolean que permitira la salida del ciclo do while
        boolean tiene_numeros;                          //Boolean para ver mas adelante si la palabra introducida tiene numeros
        boolean repetir = true;                         //Boolean para ver si se quiere introducir de nuevo la facultad
        int opcion_repetir;                             //Para recoger el valor del JOptionPane
        int[] num_array_int = new int[10];              //Arreglo para recorrer los int 0-9 y hacerlos char
        char[] numeros_array_char = new char[10];       //Arreglo para recoger los valores del 0-9 en char
        for (int i = 0; i < 10; i++) {                  //Ciclo para darles los valores a los arreglos
            num_array_int[i] = i;
            numeros_array_char[i] = (char)(num_array_int[i] + '0');
        }
        while (repetir == true) {
            do {                                            //Ciclo para repetir en caso que no sea correcta la información
                faculty = JOptionPane.showInputDialog("Ingrese la facultad");
                valid = true;                               //Inicializa el valor para poder salir del ciclo en caso de no haber errores.
                tiene_numeros = false;                      //Inicializa el valor para comprobar nuevamente si la palabra que se introduce tiene numeros
                char[] faculty_caracteres = new char[faculty.length()];     //Arreglo para tomar los caracteres individuales de la palabra introducida
                for (int i = 0; i < faculty.length(); i++) {                
                    faculty_caracteres[i] = faculty.charAt(i);              //Recoge los caracteres individuales de la palabra
                }
                if (faculty.isEmpty()) {                                    //Si no se introduce ningun caracter, pide nuevamente
                    JOptionPane.showMessageDialog(null, "Ingrese la facultad");
                    valid = false;                                          //Cambia el valor para que no se salga del ciclo
                    continue;
                }
                if (faculty.length() < 5) {                                 //Si la palabra tiene menos de 5 digitos, pide nuevamente
                    JOptionPane.showMessageDialog(null, "La facultad debe contener 5 o más caracteres");
                    valid = false;                                          //Cambia el valor para que no se salga del ciclo
                }
                if (faculty_caracteres[0] == ' ' || faculty_caracteres[faculty.length() - 1] == ' ') {          //Ve si la palabra inicia o termina con un espacio
                    JOptionPane.showMessageDialog(null, "No debe contener espacios al inicio o final");
                    valid = false;                                          //Cambia el valor para que no se salga del ciclo
                    continue;
                }
                for (int i = 0; i < faculty.length(); i++) {                //Ciclo para que revise letra por letra en busca de numeros
                    for (int j = 0; j < 10; j++) {
                        if (faculty_caracteres[i] == numeros_array_char[j]) {   //Esta condicion esta hecha con arreglos de char, al inicio es necesario
                            valid = false;                                      //cambiar las arreglos de tipo int a char para que funcione esta condicion
                            tiene_numeros = true;                               //Boolean cambia de valor para que de el mensaje de que existe numeros
                            continue;
                        }
                    }                                                                       //Condiciona que no haya más de dos espacios seguidos       
                    if (faculty_caracteres[i] == 32 && faculty_caracteres[i + 1] == 32) {   //"32" son espacios en codigo ascii    
                        JOptionPane.showMessageDialog(null, "No debe escribir espacios seguidos");  
                        valid = false;
                    }
                }
                if (tiene_numeros == true) {                        //Condicion que muestra el mensaje en caso que se cumpla
                    JOptionPane.showMessageDialog(null, "No debe contener numeros");
                }
            } while (valid == false);
            JOptionPane.showMessageDialog(null, "Facultad Valida");       //Muestra el mensaje si sale del ciclo

            opcion_repetir = JOptionPane.showConfirmDialog(null, "Desea ingresar nuevamente la facultad", "Eliga una opcion", JOptionPane.YES_NO_OPTION);
            if (opcion_repetir == 1){                                      //Condicion para ver si se quiere repetir el proceso
                repetir = false;
            } 
        }
    }
}
