public class PilhaNomes {
    String[] nomes;
    int topo;
    int tamanho = 3;

    public PilhaNomes() {
        this.nomes = new String[tamanho];
        this.topo = -1;
    }

    public boolean pilhaCheia() {
        if (topo == tamanho - 1) {
            return true;
        }else  {
            return false;
        }
    }
    public boolean pilhaVazia() {
        if (topo == -1) {
            return true;
        }else   {
            return false;
        }
    }
    public void empilhar(String n) {
        if (!pilhaCheia()) {
            topo++;
            nomes[topo] = n;
            System.out.println("Empilha " + n);
        } else   {
            System.out.println("Pilha cheia");
        }
    }

    public String desempilhar() {
        String desempilhar = null;
        if (!pilhaVazia()) {
            desempilhar = nomes[topo];
            topo--;
            System.out.println("Desempilha " + desempilhar);
        }else   {
            System.out.println("Pilha vazia");
        }
        return desempilhar;
    }

    public String topo() {
        String t = null;
        if (pilhaVazia()) {
            System.out.println("Pilha vazia");
        }else {
            t = nomes[topo];
            System.out.println("Topo da " + t);
        }
        return t;
    }

    public void mostra() {
        System.out.println("--- Elementos da Pilha ---");
        // Verifica se a pilha está vazia antes de tentar mostrar
        if (pilhaVazia()) {
            System.out.println("Pilha vazia!");
            return; // Sai do método
        }
        // Loop for que começa do topo (topo) e vai até a base (0)
        int i;
        for ( i = topo; i >= 0; i--) {
            System.out.println(nomes[i]+ " posição "+ i);
        }
        System.out.println("--------------------------");
    }

    static void main() {
        PilhaNomes p = new PilhaNomes();

        p.empilhar("1");
        p.empilhar("2");
        p.mostra();
    }
}
