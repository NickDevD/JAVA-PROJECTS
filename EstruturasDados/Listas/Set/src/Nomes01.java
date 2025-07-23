package Set.src;

import java.util.HashSet;
import java.util.Set;

public class Nomes01 {
    public static void main(String[] args) {

        Set<String> nome;

        nome = new HashSet<>();

        nome.add("Nick");
        nome.add("Gabi"); 

        for (String n : nome){
            System.out.println(n);
        }
    }
}
