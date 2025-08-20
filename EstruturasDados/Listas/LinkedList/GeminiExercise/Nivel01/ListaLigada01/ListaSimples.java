public class ListaLigada01 {
    No inicio;
    No ultimo;

    static class No{
        int valor;
        No proximo;

        public No(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    }

    public void addInicio(int valor){
        No novoNo = new No(valor);
        if (inicio == null){
            inicio = novoNo;
            System.out.println("Adicionado ao inicio: "+inicio.valor);
        }else {
            novoNo.proximo = inicio;
            inicio = novoNo;
            System.out.println("Adicionado no inicio: "+inicio.valor);
        }
    }



    public void mostrarLista(){
        No atual = inicio;
        while (atual != null){
            System.out.print(atual.valor +" -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    static void main() {
        ListaLigada01 l = new ListaLigada01();

        l.addInicio(1);
        l.addInicio(2);

        l.mostrarLista();

    }

}
