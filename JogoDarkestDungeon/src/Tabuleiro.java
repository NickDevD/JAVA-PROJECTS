public class Tabuleiro {
    public static void main(String[] args) {

        Player player = new Player("Gabriel",151,200);
        System.out.print(player.getNome() + " ");
        player.ataqueGelo();

    }
}
