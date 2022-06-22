package Login;

public class Login {
  private String ageUser;
  Age age = new Age();

  public void getCredentials() {
    age.getDocentAge();
    ageUser = age.getAge();
  }

  public String getageUser() {
    return ageUser;
  }

}
