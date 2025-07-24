package src;

import java.util.Random;

public class Mago extends Atributos implements Poderes{
    Random random = new Random();

    public Mago(String nome, double poder, double vida) {
        super(nome, poder, vida);
    }

    @Override
     public void ataqueGelo() {
        System.out.println("Ataque de gelo ocasinou um dano de " + random.nextDouble(10)+1);
    }
    @Override
    public int ataqueFogo() {
        System.out.println("Ataque de fogo ocasinou um dano de ");
        return 120;
    }
    @Override
    public void ataqueEletrico() {
        System.out.println("Ataque de eletrico ocasinou um dano de "+ 130);
    }
}
