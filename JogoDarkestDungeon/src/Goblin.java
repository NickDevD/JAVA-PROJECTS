public class Goblin extends Atributos{

    public Goblin(String nome, double vida, double poder){
        super(nome,vida,poder);
    }

    public int ataqueFraco(){
        System.out.println("Goblin ataque fraco " );
        return 50;
    }
}
