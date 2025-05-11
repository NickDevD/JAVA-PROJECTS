import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Operacoes op = new Operacoes();

        System.out.println(op.somar(in.nextInt(), in.nextInt()));



    }
}
