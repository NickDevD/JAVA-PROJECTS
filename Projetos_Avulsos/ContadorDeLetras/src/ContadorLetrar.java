package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorLetrar {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        List<String> palavras = new ArrayList<>();

        System.out.println("Digite a palavra:");

        String input;
        while (!(input = in.next()).equalsIgnoreCase("fim")){
           palavras.add(input);

        }

        for (String p : palavras){
            System.out.println("palavra: " + p + " Quantidade de letras: "
                    + p.length());
        }

        System.out.println(palavras.size());

    }

}
