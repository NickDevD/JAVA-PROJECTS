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

    public void mapearTesouros(){
        Ilha mapa = this.inicio;
        for (mapa = inicio; mapa != null ;mapa = mapa.busola ) {
            System.out.print(mapa.tesouro+" -> ");
        }
        System.out.println("null");
    }
    static void main() {
        Lista01 l = new Lista01();

        l.inserirInicio(1);
        l.inserirFinal(2);

        l.mapearTesouros();
    }
}
