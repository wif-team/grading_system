import Login.Login;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.getCredentials();
        System.out.println(login.getageUser());
    }
}