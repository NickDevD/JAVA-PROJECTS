public class ListaLigada {

    static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static No inicio = null;

    public static void main(String[] args) {
        simularLista();
    }

    // --- Métodos de Manipulação da Lista Ligada ---

    public static void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    public static void inserirNoFinal(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            return;
        }
        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
    }

    public static void inserirNaPosicao(int valor, int posicao) {
        if (posicao <= 0) {
            inserirNoInicio(valor);
            return;
        }
        No novoNo = new No(valor);
        No atual = inicio;
        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }
        if (atual == null) {
            // Este caso não foi explicitamente pedido nas mensagens de saída, mas é uma boa prática.
            return;
        }
        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
    }

    public static void remover(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        } else {
            System.out.println("Elemento não existe na lista ligada.");
        }
    }

    public static void mostrarLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    // --- Implementação do Método de Simulação ---

    public static void simularLista() {
        // Inserir: 43 no início, 89 no final, 55 na posição 2
        inserirNoInicio(43);
        inserirNoFinal(89);
        inserirNaPosicao(55, 2);

        // Consultar início e fim
        if (inicio != null) {
            System.out.println(inicio.valor);
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            System.out.println(atual.valor);
        } else {
            System.out.println("Lista vazia.");
            System.out.println("Lista vazia.");
        }

        // Mostrar a lista
        mostrarLista();

        // Remover os valores: 55, 43, 7, 89 (nesta ordem)
        remover(55);
        remover(43);
        remover(7);
        remover(89);
    }
}