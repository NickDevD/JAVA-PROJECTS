package src;

import java.util.Scanner;

public class appEstoque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Objeto obj = new Objeto("Carro", 1);

        obj.addQuantidade(in.nextInt());
        System.out.println(obj.getQuantidade());

        obj.removerQuantidade(in.nextInt());

    }
}
