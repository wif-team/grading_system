package Login;

// Comentario de prueba

public class Login {

  private String nameUser; // Variables de las credenciales del docente
  private String ageUser;
  private String identificationUser;

  Name name = new Name();
  Identification identification = new Identification();
  Age age = new Age();

  public void getCredentials() {
    age.getDocentAge();
    ageUser = age.getAge();
    name.getNameDocent();
    nameUser = name.getName();
    identification.getIdentificationDocent();
    identificationUser = identification.getIdentification();
  }

  public String getNameUser() { // Metodos para obtener los datos
    return nameUser;
  }

  public String getIdentificationUser() {
    return identificationUser;
  }

  public String getageUser() {
    return ageUser;
  }

}
