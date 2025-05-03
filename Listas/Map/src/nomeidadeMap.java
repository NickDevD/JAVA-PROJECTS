import java.util.HashMap;
import java.util.Map;

public class nomeidadeMap {
    public static void main(String[] args) {

        Map<String, Integer> nomeIdade = new HashMap<>();

        nomeIdade.put("Nicholas", 30);

        int idadeNick = nomeIdade.get("Nicholas");

        System.out.println(idadeNick);


    }
}
