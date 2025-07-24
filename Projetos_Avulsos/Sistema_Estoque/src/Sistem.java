package src;

import java.util.Scanner;

public class Sistem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Controller con = new Controller();


        boolean select = true;
        while (select){
            System.out.println("Selecione: ");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");

            int op = in.nextInt();
            switch (op){
                case 1:
                    System.out.println("Inserir dados do produto");
                    Product product = new Product(in.nextInt(), in.next(), in.nextDouble());
                    con.addProduct(product);
                    break;

                case 2:
                    int removeID = in.nextInt();
                    con.removeProducts(removeID);
                    break;

                case 4:
                    select = false;
                    System.out.println("Sistema encerrado");
                    break;
            }


        }
        in.close();
    }
}
