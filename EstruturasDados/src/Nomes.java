package ArrayList.src;

import java.util.ArrayList;
import java.util.List;

public class Nomes {

public static void main(String[] args) {
    List<String> nome = new ArrayList<>();

        nome.add("Nick");
        nome.add("Gabi");
        nome.add("Mike");

        for (String n : nome){
            System.out.println(n);
        }
    }
}
