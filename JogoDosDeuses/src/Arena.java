import java.util.Random;

public class Arena {
    public static void main(String[] args) {
        Random random = new Random();
        NPC npc1 = new NPC("Zeus", random.nextInt(10) + 1);
        System.out.println(npc1.getPoder());

        NPC npc2 = new NPC("Hades", random.nextInt(10) + 1);
        System.out.println(npc2.getPoder());

        if (npc1.getPoder() > npc2.getPoder()){
            System.out.println(npc1.getNome() + " Venceu");
        }else {
            System.out.println(npc2.getNome() + " Venceu");
        }
    }

}
