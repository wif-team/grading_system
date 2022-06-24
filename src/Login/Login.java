package Login;

// Comentario de prueba

public class Login {

  private String nameUser; // Variables de las credenciales del docente
  private String ageUser;
  private String identificationUser;
  private String addressUser;
  private String passwordUser;

  Name name = new Name();
  Identification identification = new Identification();
  Age age = new Age();
  Address address = new Address();
  Password password = new Password();

  public void getCredentials() {
    age.getDocentAge();
    ageUser = age.getAge();
    name.getNameDocent();
    nameUser = name.getName();
    identification.getIdentificationDocent();
    identificationUser = identification.getIdentification();
    address.getDocentAddress();
    addressUser = address.getAddress();
    password.getDocentPassword();
    passwordUser = password.getPassword();
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

}
