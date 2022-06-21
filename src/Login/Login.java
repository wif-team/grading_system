package Login;

public class Login {
  public static void main(String[] args) {
    NameIdentification nameIdentification = new NameIdentification();
    nameIdentification.showNameIdentification();
    FacultyEmail facultyEmail = new FacultyEmail();
    facultyEmail.showFacultyEmail();
    PasswordAge passwordAge = new PasswordAge();
    passwordAge.showPasswordAge();
  }
}
