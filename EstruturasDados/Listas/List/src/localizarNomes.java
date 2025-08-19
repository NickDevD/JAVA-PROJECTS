
import java.util.ArrayList;
import java.util.List;

public class localizarNomes {

    public static String encontrarA(List<String> listaDeNomes){
        for (String nome : listaDeNomes){
            if (nome.startsWith("N")){
                return nome;
            }
        }
        return null;
    }

     static void main(String[] args) {

        List<String> listaNomes;

        listaNomes = new ArrayList<>();
        listaNomes.add("Nick");
        listaNomes.add("Gabi");

        String n1 = encontrarA(listaNomes);

        System.out.println(n1);
    }
}
