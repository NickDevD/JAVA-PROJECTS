public abstract class Atributos {
    private String nome;
    private double poder;
    private double vida;

    public Atributos(String nome, double poder, double vida){
        this.nome = nome;
        this.poder =poder;
        this.vida = vida;
    }
    public double getPoder() {
        return poder;
    }

    public double getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }
}
