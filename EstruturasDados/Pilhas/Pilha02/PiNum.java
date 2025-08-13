public class PiNum {
    int[] num;
    int tamanho = 3;
    int posicao; // 'posicao' representa o índice do topo da pilha

    public PiNum() {
        this.num = new int[tamanho];
        this.posicao = -1; // -1 indica pilha vazia
    }

    public void push(int x) {
        if (posicao == tamanho - 1) { // Verifica se a pilha está cheia
            System.out.println("Pilha cheia");
        } else {
            posicao++; // Move 'posicao' para o próximo espaço livre
            num[posicao] = x; // Coloca o elemento no novo 'posicao'
            System.out.println("Push: "+x);
        }
    }

    public int pop() {
        // 1. Verificar se a pilha está vazia: CORRETA!
        if (posicao == -1) {
            System.out.println("Pilha vazia");
            return -1; // Retorna um valor sentinela, indicando falha
        } else {
            // 2. CORREÇÃO AQUI: Primeiro, pegue o elemento que está no topo ATUAL.
            // 'posicao' ainda aponta para o elemento que queremos remover.
            int n = num[posicao];

            // 3. Depois de pegar o elemento, "remova-o" logicamente
            // decrementando 'posicao'. Isso faz com que 'posicao' aponte
            // para o novo topo (ou para -1 se a pilha ficar vazia).
            posicao--;

            System.out.println("Pop: "+n);
            return n; // Retorna o elemento que foi efetivamente removido
        }

    }

    public int peek(){
        if (posicao == -1) {
            System.out.println("Pilha vazia");
            return -1;
        }else {
            int n = num[posicao];
            System.out.println("Peek: "+n);
            return n;
        }
    }


    public static void main(String[] args) {
        PiNum p = new PiNum();

        p.push(5); // Pilha: [10], pos=0
        p.push(8); // Pilha: [10, 20], pos=1
        p.push(4); // Pilha: [10, 20, 30], pos=2
        p.push(7); // Pilha cheia

        System.out.println("-------------");

        p.pop(); // Deverá imprimir "Pop: 30" (e 'posicao' vira 1)
        p.pop(); // Deverá imprimir "Pop: 20" (e 'posicao' vira 0)
        p.peek();
        p.pop(); // Deverá imprimir "Pop: 10" (e 'posicao' vira -1)
        p.pop(); // Deverá imprimir "Pilha vazia"

    }
}