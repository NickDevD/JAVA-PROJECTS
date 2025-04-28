import java.util.Random;

public class randomNumeros {
    private int numero;
    private Random random = new Random();

    public randomNumeros(int numero){
       this.numero = random.nextInt(1000) + 1;
    }

    public int getNumero() {
        return numero;
    }
}
