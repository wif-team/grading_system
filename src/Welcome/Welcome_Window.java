package Welcome;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import Login.Login;

public class Welcome_Window {

    public void start() {
        Login login = new Login();
        login.getCredentials();
        LocalDateTime date = LocalDateTime.now();
        String day = date.getDayOfWeek().toString();
        String month = date.getMonth().toString();
        String year = date.getYear() + "";
        String hour = date.getHour() + "";
        String minute = date.getMinute() + "";
        String second = date.getSecond() + "";
        String time = hour + ":" + minute + ":" + second;
        String dateTime = day + " " + month + " " + year + " " + time;
        String name = login.getNameUser();
        String identification = login.getIdentificationUser();
        String email = login.getEmailUser();
        String age = login.getageUser();
        String adress = login.getAddresUser();
        String card_manager = "Jair Mera\nAnita Manobanda";

        JOptionPane.showMessageDialog(null,
                "****************************************************************\n"
                        + "*Bienvenido a Grading System " + name + "                            *\n"
                        + "****************************************************************\n"
                        + "\nLa hora actual es: " + dateTime
                        + "\nSu dirección es: " + adress
                        + "\nSu cédula es: " + identification
                        + "\nSu correo electrónico es: " + email
                        + "\nSu edad es: " + age
                        + "\n\nDescripción de Grading System:\n"
                        + "Grading System es un sistema de calificación que permite a los docentes\n"
                        + "guardar las calificaciones de los estudiantes segun su semestre, \n"
                        + "curso y materia, para luego poder consultarlas y modificarlas.\n"
                        + "\nEncargados de la card: \n" + card_manager,
                "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
    }
}
