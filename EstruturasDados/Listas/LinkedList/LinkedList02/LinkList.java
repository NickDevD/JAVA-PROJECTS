public class LinkList {
    private No primeiro;
    private No ultimo;

    static class No{
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
        }
    }


    public void add(int valor){
        No novoNo = new No(valor);
        if (this.primeiro == null && this.ultimo == null){
            primeiro = novoNo;
            ultimo = novoNo;
            System.out.println(novoNo.valor);
        }
    }

    public void addFinal(int valor){
        No novoNo = new No(valor);
        if (primeiro == null){
            primeiro = novoNo;
            return;
        }

        No atual = primeiro;
        while (atual.proximo != null){
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
        System.out.println("Final "+novoNo.valor);
    }

    static void main() {
        LinkList l = new LinkList();

        l.add(2);
        l.addFinal(10);
        l.addFinal(3);

    }
}
