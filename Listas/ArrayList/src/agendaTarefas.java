import java.util.ArrayList;
import java.util.List;

public class agendaTarefas{
    public static void main(String[] args) {

        List<String> tarefas = new ArrayList<>();

        tarefas.add("Lavar o carro");
        tarefas.add("Lavar os pratos");
        tarefas.add("Estudar");

        for (String tarefa : tarefas){
            System.out.println(tarefa);
        }
    }
}
