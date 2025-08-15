import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ManipulandoLists {
    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(30);

        List<Integer> listaNumerosLinked = new LinkedList<>();
        listaNumerosLinked.add(0,30);
        listaNumerosLinked.addLast(70);

        for (Integer list : listaNumerosLinked){
            System.out.println(list);
        }
    }
}
