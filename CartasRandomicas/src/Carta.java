import java.util.Random;

public class Carta {
    String nome;
    double poder;
    private static Random random = new Random();

    public Carta(String nome, double poder){
        this.nome = nome;
        this.poder = random.nextInt(10) + 1;

    }

   public void mostrarCarta(){
       System.out.println(nome + poder);
   }
}
