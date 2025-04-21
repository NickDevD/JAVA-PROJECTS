import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> nomes;

        nomes = new ArrayList<>();

        nomes.add("Nick");
        nomes.add("Gabi");
        nomes.add("Mike");


        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
