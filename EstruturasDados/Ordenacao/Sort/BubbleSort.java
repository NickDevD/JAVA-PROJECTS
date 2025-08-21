// Define uma classe pública chamada 'BubbleSort'. Classes em Java são como "plantas" para criar objetos.
public class BubbleSort {

    // Define um método estático e público chamado 'BubbleSort' que recebe um array de inteiros.
    // O 'static' significa que podemos chamar este método sem criar uma instância da classe.
    public static void BubbleSort(int[] array) {
        // Armazena o tamanho do array na variável 'n' para uso posterior.
        // Isso evita que o programa tenha que calcular o tamanho a cada vez que precisar.
        int n = array.length;

        // --- Laço externo ---
        // Este laço principal controla o número de passagens necessárias para ordenar o array.
        // Ele garante que cada elemento "borbulhe" para a sua posição correta.
        for (int i = 0; i < n - 1; i++) {

            // --- Laço interno ---
            // Este laço percorre os elementos do array, comparando pares adjacentes.
            // O 'n - i - 1' otimiza o algoritmo, pois a cada passagem, o maior elemento já está no final,
            // então não é necessário compará-lo novamente.
            for (int j = 0; j < n - i - 1; j++) {

                // --- Condição de comparação e troca ---
                // Esta é a linha central do algoritmo. Ela verifica se o elemento atual (array[j])
                // é maior que o seu vizinho (array[j+1]).
                if (array[j] > array[j + 1]) {

                    // --- Início da troca ---
                    // Se a condição for verdadeira, uma variável temporária ('temp') é usada para
                    // guardar o valor do elemento atual antes de ele ser sobrescrito.
                    int temp = array[j];

                    // O valor do elemento maior é substituído pelo valor do seu vizinho menor.
                    array[j] = array[j + 1];

                    // O valor menor (que estava em 'temp') é colocado na posição do vizinho maior,
                    // completando a troca.
                    array[j + 1] = temp;
                    // --- Fim da troca ---
                }
            }
        }
    }

    // O método 'main' é o ponto de entrada do programa.
    static void main() {
        // Declara e inicializa um array de inteiros.
        int[] numeros = {5, 1, 4, 2, 8};

        // Chama o método 'BubbleSort' para ordenar o array 'numeros'.
        BubbleSort(numeros);

        // Um laço 'for-each' simples para percorrer o array já ordenado.
        for (int numero : numeros) {
            // Imprime cada número do array, seguido de um espaço, para exibir o resultado.
            System.out.print(numero + " ");
        }
    }
}