import java.util.Arrays;
import java.util.Collections;

public class MostrarMaior {

    public static void Maior(String[]array) {
        Arrays.sort(array);
    }

    public static void Reversal(String[]array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    static void main() {
        String[]nomes = {"Nick", "Gabi", "fabi"};

       Maior(nomes);

       for (String nome : nomes) {
           System.out.println(nome);
       }

       Reversal(nomes);

       for (String nome : nomes) {
           System.out.println(nome);
       }

    }
}
