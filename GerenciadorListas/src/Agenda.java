public class Agenda {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Trabalhar dia 08/04");

        Lista lista = new Lista();
        lista.adicionarTarefa(tarefa1);

        lista.display();
    }
}
