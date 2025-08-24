public class Lista01 {

    static class Ilha{
        int tesouro;
        Ilha busola;

        Ilha(int tesouro){
            this.tesouro = tesouro;
            this.busola = null;
        }
    }

    static Ilha inicio;
    static Ilha fim;

    public void inserirInicio(int tesouro){
        Ilha novaIlha = new Ilha(tesouro);
        if (this.inicio == null){
            this.inicio = novaIlha;
            this.fim = novaIlha;
        }else {
            novaIlha.busola = this.inicio;
            this.inicio = novaIlha;
        }
    }

    public void inserirFinal(int tesouro){
        Ilha novaIlha = new Ilha(tesouro);
        if (this.inicio == null) {
            this.inicio = novaIlha;
            this.fim = novaIlha;
        }else {
           this.fim.busola = novaIlha;
           this.fim = novaIlha;
        }
    }

    public void remover(int valor){
        if (this.inicio == null) {
            System.out.println("Nenhum elemento encontrado");
            return;
        }

        if(this.inicio.tesouro == valor){
            this.inicio =  this.inicio.busola;
            return;
        }

        Ilha atual = inicio;
        while (atual.busola != null && atual.busola.tesouro != valor) {
            atual = atual.busola;
        }

        if (atual.busola != null) {
            atual.busola = atual.busola.busola;
        }else  {
            System.out.println("Nenhum elemento encontrado");
        }

        if (atual.busola == null) {
            fim = atual;
        }
    }

    public void mapearTesouros(){
        Ilha mapa = inicio;
        for (mapa = inicio; mapa != null ;mapa = mapa.busola ) {
            System.out.print(mapa.tesouro+" -> ");
        }
        System.out.println("null");
    }
    static void main() {
        Lista01 l = new Lista01();

        l.inserirInicio(1);
        l.inserirFinal(2);
        l.inserirInicio(3);

        l.remover(2);
        l.mapearTesouros();
    }
}
