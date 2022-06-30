import Welcome.WelcomeWindow;

public class Main {
    public static void main(String[] args) {
        DieMethod die = new DieMethod();
        die.die();
        WelcomeWindow welcome = new WelcomeWindow();
        welcome.start();
    }
}