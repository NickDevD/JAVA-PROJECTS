import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Tarefa tarefa1 = new Tarefa("Trabalhar dia 08/04");
        Tarefa tarefa2 = new Tarefa("Resovler cards");
        Tarefa tarefa3 = new Tarefa("Adicionar funções");
        tarefa3.setDescricao(in.next());

        Lista lista = new Lista();
        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);
        lista.adicionarTarefa(tarefa3);

        lista.display();
    }
}
