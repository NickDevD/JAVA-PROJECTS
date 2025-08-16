public class ListaLigada01 {
    Node inicio;
    Node ultimo;

    // -- 1. Contrução do No --
    static class Node {
        int valor;
        Node proximo;

        //-- 2. Contrutor para o No --
        Node(int valor) {
            this.valor = valor;
            this.proximo = null; // Boa prática
        }
    }

    public void addInicio(int valor) {
        Node novoNo = new Node(valor);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        }else  {
            novoNo.proximo = inicio;
            inicio = novoNo;
        }
    }

    public void addFinal(int valor) {
        Node novoNo = new Node(valor);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        }else  {
            this.ultimo.proximo = novoNo;
            this.ultimo = novoNo;
        }
    }

    public void remover(int valor) {
        if (this.inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (this.inicio.valor == valor) {
            this.inicio = this.inicio.proximo;
        }

        Node atual = this.inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }
        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }

    public void mostrarLista(){
        Node atual = inicio;
        while(atual != null){
            System.out.print(atual.valor+"->");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    static void main() {
        ListaLigada01 l = new ListaLigada01();

        l.addInicio(1);
        l.addInicio(2);
        l.addInicio(3);
        l.addFinal(10);

        l.remover(10);

        l.mostrarLista();
    }
}
