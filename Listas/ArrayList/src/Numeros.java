import java.util.ArrayList;
import java.util.List;

public class Numeros {
    public static void main(String[] args) {

        List<Integer> numeros;

        numeros = new ArrayList<>();

        for (int numero = 0; numero < 10; numero++) {
            numeros.add(numero);
        }

        List<Integer> numerosMulplicados = new ArrayList<>();

        for (int numero : numeros){
            numerosMulplicados.add(numero*2);
        }

        System.out.println(numeros);
        System.out.println(numerosMulplicados);



    }
}
