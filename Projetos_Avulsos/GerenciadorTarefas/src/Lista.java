package src;

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

    int sequencia = 0;
    public void display(){
        for (Tarefa tarefa : tarefas){
            sequencia++;
            System.out.println("Tarefas: " + sequencia + "." + tarefa.getDescricao());
        }
    }
}
