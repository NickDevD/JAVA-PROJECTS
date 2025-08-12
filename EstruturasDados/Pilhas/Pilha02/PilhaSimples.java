public class PilhaSimples {
    public int[] num;
    public int tamanho = 3;
    public int posicao;

    public PilhaSimples() {
        this.num = new int[tamanho];
        this.posicao = -1;
    }

    public void empilhar(int valor) {
        if (posicao == tamanho - 1) {
            System.out.println("Pilha cheia!");
        }else {
            posicao++;
            num[posicao] = valor;
            System.out.println(valor);
        }
    }

    public int desempilhar() {
        if (posicao == -1) {
            System.out.println("Pilha vazia!");
            return -1;
        }else  {
            int n = num[posicao];
            posicao--;
            System.out.println(n);
            return n;
        }
    }

    public int topo(){
        if (posicao == -1) {
            System.out.println("Pilha vazia!");
            return -1;
        }else  {
            int n = num[posicao];
            System.out.println(n);
            return n;
        }
    }

    public static void main(String[] args) {
        simularPilha();
    }

    public static void simularPilha() {
        PilhaSimples p = new PilhaSimples();

        p.empilhar(5);
        p.empilhar(8);
        p.empilhar(4);
        p.empilhar(7);

        p.desempilhar();
        p.desempilhar();

        p.topo();

        p.desempilhar();
        p.desempilhar();

    }
}