package Arrays_Simples.src;

import java.util.Scanner;

public class ListarNomes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int nome = 0; nome < nomes.length; nome++) {
            nomes[nome] = in.next();
        }

        int seq = 0;
        for (String N : nomes){
            seq++;
            System.out.println(seq + "." + N);
        }
    }
}
