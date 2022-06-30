package Login;

// Comentario de prueba

public class Login {

  private String nameUser; // Variables de las credenciales del docente
  private String ageUser;
  private String identificationUser;
  private String addressUser;
  private String passwordUser;
  private String emailUser;
  private String facultyUser;

  Name name = new Name();
  Identification identification = new Identification();
  Age age = new Age();
  Address address = new Address();
  Password password = new Password();
  Email email = new Email();
  Faculty faculty = new Faculty();

  public void getCredentials() {
    name.getNameDocent();
    nameUser = name.getName();
    identification.getIdentificationDocent();
    identificationUser = identification.getIdentification();
    passwordUser = password.getDocentPassword();
    ageUser = age.getDocentAge();
    emailUser = email.getDocentEmail();
    facultyUser = faculty.getDocentFaculty();
    addressUser = address.getDocentAddress();
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