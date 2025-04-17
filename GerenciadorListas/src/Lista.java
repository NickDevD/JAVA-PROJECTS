import java.util.ArrayList;

public class Lista {

    ArrayList<Tarefa> tarefas;

    public Lista(){
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getDescricao());
    }

    public void excluirTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
        System.out.println("tarefa removida: " + tarefa.getDescricao());
    }

    public void display(){
        for (Tarefa tarefa : tarefas){
            System.out.println(tarefa.getDescricao());
        }
    }
}
