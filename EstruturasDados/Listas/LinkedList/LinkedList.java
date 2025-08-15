public class LinkedList {
    Node primeiro;
    Node ultimo;
    int tamanho;

    static class Node{
    int valor;
    Node proximo;

    public Node(int valor) {
            this.valor = valor;
        }
    }

    public void add(int valor){
        Node n = new Node(valor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = n;
            this.ultimo = n;
            System.out.println("Primeiro: "+primeiro.valor);
        }
        tamanho++;
    }

    public void addFinal(int valor){
        Node n = new Node(valor);
        if(!(this.primeiro == null)){
            this.ultimo.proximo = n;
            tamanho++;
            System.out.println("Ultimo: "+ultimo.proximo.valor);
        }
    }

    public int tamanhoLista(){
        System.out.println("Tamanho da lista: "+tamanho);
        return tamanho;
    }

    public void mostrarLista(){
        Node atual = primeiro;
        while(atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }

    }

    public void
    static void main() {

        LinkedList lista = new LinkedList();
        lista.add(43);
        lista.addFinal(89);
        lista.tamanhoLista();
        lista.mostrarLista();

    }
}
