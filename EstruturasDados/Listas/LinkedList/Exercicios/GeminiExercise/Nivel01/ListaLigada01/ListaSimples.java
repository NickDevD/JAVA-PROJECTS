public class ListaSimples {

    static class Node{
        int valor;
        Node proximo;

        Node(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    }

    Node inicio;
    Node fim;

    public void addInicio(int valor){
        Node novoNo = new Node(valor);
        if(inicio == null && fim == null){
            inicio = novoNo;
            fim = novoNo;
        }else {
            novoNo.proximo = inicio;
            inicio = novoNo;
        }
    }

    public void addFinal(int valor){
        Node novoNo = new Node(valor);
        if (inicio == null){
            inicio = novoNo;
            fim = novoNo;
        }else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public void inserirPos(int valor, int posicao){
        if (posicao <= 0){
            addInicio(valor);
            return;
        }

        Node novoNo = new Node(valor);
        int contador = 0;
        Node atual = inicio;
        while (atual != null && contador != posicao-1 ){
            atual = atual.proximo;
            contador++;
        }
        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
    }

    public void remover(int valor){
        if(inicio == null){
            System.out.println("Lista vazia");
            return;
        }
        if (inicio.valor == valor){
            inicio = inicio.proximo;
            return;
        }

        Node atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor){
            atual = atual.proximo;
        }

        if (atual.proximo != null){
            atual.proximo = atual.proximo.proximo;
        }

        if (atual.proximo == null){
            fim = atual;
        }

    }

    public void mostrarLista(){
        if(inicio == null){
            System.out.println("Lista vazia");
        }

        Node atual = inicio;
        while (atual != null){
            System.out.print(atual.valor+" --> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListaSimples l = new ListaSimples();

        System.out.println("----- Métodos Lista Ligada -----");
        l.addInicio(2);
        l.addInicio(3);
        l.addFinal(4);
        l.inserirPos(10,2);
        l.mostrarLista();
    }
}
