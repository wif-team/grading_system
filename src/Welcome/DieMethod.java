
//se llamará al método die mediante .die en la creación de un objeto de la clase dieMethod.

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DieMethod {

    private ArrayList<String> phrases = new ArrayList<String>();
    private Random random;
    private int index;

    public DieMethod() {
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

    }

    public void die() {
        random = new Random();
        this.index = random.nextInt(phrases.size());
        JOptionPane.showMessageDialog(null, phrases.get(index));
    }

}
