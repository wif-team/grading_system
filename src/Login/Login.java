package Login;

import javax.swing.JOptionPane;

// Comentario de prueba

public class Login {

  private String nameUser; // Variables de las credenciales del docente
  private String ageUser;
  private String identificationUser;
  private String addressUser;
  private String passwordUser;
  private String emailUser;
  private String facultyUser;
  int reenterdata = 0;

  Name name = new Name();
  Identification identification = new Identification();
  Age age = new Age();
  Address address = new Address();
  Password password = new Password();
  Email email = new Email();
  Faculty faculty = new Faculty();

  public void getCredentials() {
    do {
      nameUser = name.getNameDocent();
      identificationUser = identification.getIdentificationDocent();
      passwordUser = password.getDocentPassword();
      ageUser = age.getDocentAge();
      emailUser = email.getDocentEmail();
      facultyUser = faculty.getDocentFaculty();
      addressUser = address.getDocentAddress();
      reenterdata = JOptionPane.showConfirmDialog(null,
          "¿Sus datos estan correctos?\n Nombre: " + nameUser + "\nIdentificacion: " + identificationUser
              + "\nContraseña: " + passwordUser
              + "\nEdad: " + ageUser + "\nEmail: " + emailUser + "\nFacultad: " + facultyUser + "\nDireccion: "
              + addressUser + " \n¿Desea ingresar nuevamente los datos?",
          "", JOptionPane.YES_NO_OPTION);
      if (reenterdata == JOptionPane.YES_NO_OPTION) {
        reenterdata = 0;
      }
    } while (reenterdata == 0);
  }

  // Metodos para obtener los datos

  public String getAddresUser() {
    return addressUser;
  }

  public String getPasswordUser() {
    return passwordUser;
  }

  public String getNameUser() {
    return nameUser;
  }

  public String getIdentificationUser() {
    return identificationUser;
  }

  public String getageUser() {
    return ageUser;
  }

  public String getEmailUser() {
    return emailUser;
  }

  public String getFacultyUser() {
    return facultyUser;
  }

}
