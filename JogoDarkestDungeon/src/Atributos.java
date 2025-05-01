public abstract class Atributos {
    String nome;
    double poder;
    double vida;

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
