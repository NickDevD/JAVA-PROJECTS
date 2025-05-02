public class Tabuleiro {
    public static void main(String[] args) {

        Mago mago001 = new Mago("Magus",600,150);

        Goblin goblin001 = new Goblin("Koki", 150, 100);


        int vida;
        if (mago001.getPoder() < goblin001.getPoder()){
            mago001.ataqueFogo();
            System.out.println(goblin001.getVida() - mago001.ataqueFogo());
        }else {
            System.out.println("Goblin revidou");
            vida = (int) (mago001.getVida() - goblin001.ataqueFraco());
            System.out.println("Mago recebeu um dano! Vida restante : " + vida);
        }

    }
}
