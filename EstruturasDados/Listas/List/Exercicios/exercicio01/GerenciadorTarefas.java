import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    private ArrayList<String> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        if (tarefa == null || tarefa.trim().isEmpty()) {
            System.out.println("A tarefa não pode ser vazia.");
            return;
        }
        this.tarefas.add(tarefa);
        int indice = this.tarefas.indexOf(tarefa);
        System.out.println("[" + indice + "] Tarefa '" + tarefa + "' adicionada.");
    }

    public void removerTarefa(String tarefa) {
        boolean removida = this.tarefas.remove(tarefa);
        if (removida) {
            System.out.println("Tarefa '" + tarefa + "' removida.");
        } else {
            System.out.println("Tarefa '" + tarefa + "' não encontrada.");
        }
    }

    public void removerTarefaPorIndice(int indice) {
        if (indice >= 0 && indice < this.tarefas.size()) {
            String tarefaRemovida = this.tarefas.remove(indice);
            System.out.println("Tarefa '" + tarefaRemovida + "' no índice [" + indice + "] concluída e removida.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarTarefas() {
        System.out.println("\n--- Lista de Tarefas ---");
        if (this.tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            for (int i = 0; i < this.tarefas.size(); i++) {
                System.out.println("[" + i + "] " + this.tarefas.get(i));
            }
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GerenciadorTarefas g = new GerenciadorTarefas();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Concluir Tarefa (por índice)");
            System.out.println("3. Remover Tarefa (por nome)");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = in.nextInt();
                in.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a tarefa a ser adicionada: ");
                        g.adicionarTarefa(in.nextLine());
                        break;
                    case 2:
                        System.out.print("Digite o índice da tarefa concluída: ");
                        g.removerTarefaPorIndice(in.nextInt());
                        in.nextLine();
                        break;
                    case 3:
                        System.out.print("Digite o nome da tarefa a ser removida: ");
                        g.removerTarefa(in.nextLine());
                        break;
                    case 4:
                        g.listarTarefas();
                        break;
                    case 5:
                        rodando = false;
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número para a opção.");
                in.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
            }
        }
        in.close();
    }
}