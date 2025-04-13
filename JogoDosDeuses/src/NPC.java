import java.util.Random;

public class NPC {
    String nome;
    double poder;
    private static Random random = new Random();

    public NPC(String nome, double poder){
        this.nome = nome;
        this.poder = random.nextInt(10) + 1;

    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
