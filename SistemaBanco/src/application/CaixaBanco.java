package application;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import java.util.Scanner;

public class CaixaBanco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ContaPoupanca cp = new ContaPoupanca("Nick", 0);

        ContaCorrente cc = new ContaCorrente("Nick", 2000);
        String continuar;

        System.out.println("iniciando o sistema...");
        try {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Conta: " + cc.getNomeTitular());
                System.out.println("Saldo: " + cc.getSaldo());


            do {
                System.out.println("Qual operação deseja realizar?");
                System.out.println("1 - Deposito");
                System.out.println("2 - Saque");
                System.out.println("3 - Transferir");


                    int op = in.nextInt();
                    switch (op){
                        case 1:
                            System.out.print("Insira um valor: ");
                            cc.depositar(in.nextDouble());
                            in.nextLine();
                            break;
                        case 2:
                            System.out.print("Insira um valor");
                            cc.sacar(in.nextDouble());
                            in.nextLine();
                            break;
                        case 3:
                            System.out.print("Insira um valor: ");
                            cc.transferir(in.nextDouble(), cp);
                            in.nextLine();
                            break;
                    }

                System.out.print("Deseja continuar? (Y/N): ");
                continuar = in.nextLine().trim().equalsIgnoreCase("Y") ? "Y" : "N";

            } while (continuar.equalsIgnoreCase("Y"));
            System.out.println("Fim do sistema!");
            in.close();

        } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

    }

}
