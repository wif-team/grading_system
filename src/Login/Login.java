package Login;

public class Login {
  public static void main(String[] args) {
    Name name = new Name();
    name.showName();
    Identification identification = new Identification();
    identification.showIdentification();
    Faculty faculty = new Faculty();
    faculty.showFaculty();
    Email email = new Email();
    email.showEmail();
    Password password = new Password();
    password.showPassword();
    Age age = new Age();
    age.showAge();
    Address address = new Address();
    address.showAddress();

  }
}
