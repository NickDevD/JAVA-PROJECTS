import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Player extends Atributos implements Poderes{
    Random random = new Random();

    public Player(String nome, double poder, double vida) {
        super(nome, poder, vida);
    }

    @Override
     public void ataqueGelo() {
        System.out.println(random.nextDouble(10)+1);
    }
}
