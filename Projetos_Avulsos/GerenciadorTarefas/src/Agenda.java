package src;

public class Agenda {
    public static void main(String[] args) {


        Tarefa tarefa1 = new Tarefa("Lavar a louça");
        Tarefa tarefa2 = new Tarefa("Lavar o carro");


        Lista lista = new Lista();
        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);

        lista.display();
    }
}
