import java.util.Random;

public class Arena {
    public static void main(String[] args) {

        NPC npc1 = new NPC("Zeus");
        System.out.println(npc1.getPoder());

        NPC npc2 = new NPC("Hades");
        System.out.println(npc2.getPoder());

        if (npc1.getPoder() > npc2.getPoder()){
            System.out.println(npc1.getNome() + " Venceu");
        }else {
            System.out.println(npc2.getNome() + " Venceu");
        }
    }

}

