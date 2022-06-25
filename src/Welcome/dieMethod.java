package Welcome;
//dieMethod es un método que nos generará un consejo aleatorio de un Array dinámico impreso mediante JOptionPane.showMessageDialog.

//se llamará al método die mediante .die en la creación de un objeto de la clase dieMethod.

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class dieMethod {

    private ArrayList<String> phrases = new ArrayList<String>();
    private Random random;
    private int index;

    public dieMethod() {
        phrases.add("Nunca te rindas");
        phrases.add("Nunca pares de aprender");
        phrases.add("Nunca pares de intentar");
        phrases.add("Nunca pares de ser mejor");
        phrases.add("Vida solo hay una");
        phrases.add("Un gran poder conlleva una gran responsabilidad");
        phrases.add("Que no se te quede en la cabeza, solo házlo");
        phrases.add("Siempre hay una oportunidad");
        phrases.add("Si puedes imaginarlo, puedes programarlo");
        phrases.add("No hay nada mejor que una oportunidad para ser mejor");
        phrases.add("Primero pienso luego existo");
        phrases.add("Cree en ti y todo sera posible");
        phrases.add("Podran robarte las ideas pero nunca el Talento");
        phrases.add("Sere breve, Te esperan cosas hermosas solo resiste y manten la Fe");
        phrases.add("Sin lluvia no hay flores");
        phrases.add("Planta en ti, lo que quieres que florezca en los demas");
        phrases.add("Confia en ti mismo, Sabes mas delo que crres que sabes");
        phrases.add("Si tu dia esta amargo sacudelo un poco, a veces el azucar esta en el fondo");
        phrases.add("No te detengas hasta que te sientas orgullosa/o");
        phrases.add("Encuentra la parte positiva en todo");
        phrases.add("La confianza en uno mismo es el primer secreto del exito");
        phrases.add("Lo unico imposible es aquello que no lo intentas");
        phrases.add("Deja que el --NO VAS A PODER-- de la gente sea **TU MOTIVACION");
        



    }

    public void die() {
        this.random = new Random();
        this.index = random.nextInt(phrases.size());
        JOptionPane.showMessageDialog(null, phrases.get(index));
    }

}
