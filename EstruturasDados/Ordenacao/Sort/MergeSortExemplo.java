/**
 * A classe MergeSortExemplo demonstra o algoritmo de ordenação Merge Sort.
 * O Merge Sort é um algoritmo de divisão e conquista que divide um array
 * em metades, ordena recursivamente cada metade e, em seguida, mescla
 * as metades ordenadas.
 */
public class MergeSortExemplo {

    /**
     * Método principal que inicia o processo de ordenação recursiva.
     * Ele implementa a etapa de "divisão" do algoritmo.
     * @param array O array de inteiros a ser ordenado.
     * @param esquerda O índice inicial do segmento do array.
     * @param direita O índice final do segmento do array.
     */
    public void sort(int[] array, int esquerda, int direita) {
        // A condição de parada da recursão: só continua se o segmento tiver mais de um elemento.
        if (esquerda < direita) {
            // Encontra o índice do meio para dividir o array em duas metades.
            // A fórmula evita um possível "stack overflow" para arrays muito grandes.
            int meio = esquerda + (direita - esquerda) / 2;

            // Chama recursivamente o método sort para ordenar a primeira metade.
            sort(array, esquerda, meio);

            // Chama recursivamente o método sort para ordenar a segunda metade.
            sort(array, meio + 1, direita);

            // Depois que as duas metades estão ordenadas, elas são combinadas.
            merge(array, esquerda, meio, direita);
        }
    }

    /**
     * Método que mescla (combina) duas sub-arrays já ordenadas.
     * Esta é a etapa de "conquista" do algoritmo.
     * @param array O array original no qual a mesclagem será realizada.
     * @param esquerda O índice inicial da primeira sub-array.
     * @param meio O índice final da primeira sub-array e início da segunda.
     * @param direita O índice final da segunda sub-array.
     */
    private void merge(int[] array, int esquerda, int meio, int direita) {
        // Determina o tamanho da primeira e da segunda sub-array.
        int tamanho1 = meio - esquerda + 1;
        int tamanho2 = direita - meio;

        // Cria arrays temporários para armazenar os elementos das duas sub-arrays.
        int[] L = new int[tamanho1];
        int[] R = new int[tamanho2];

        // Copia os elementos da primeira metade para o array temporário L.
        for (int i = 0; i < tamanho1; ++i)
            L[i] = array[esquerda + i];

        // Copia os elementos da segunda metade para o array temporário R.
        for (int j = 0; j < tamanho2; ++j)
            R[j] = array[meio + 1 + j];

        // Inicializa os índices para iterar sobre os arrays temporários (i e j)
        // e para o array principal (k).
        int i = 0, j = 0;
        int k = esquerda;

        // Mescla os elementos de L e R de volta para o array principal,
        // comparando os elementos um a um e colocando-os na ordem correta.
        while (i < tamanho1 && j < tamanho2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Se ainda houver elementos restantes no array L, eles são copiados para o array principal.
        while (i < tamanho1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Se ainda houver elementos restantes no array R, eles são copiados para o array principal.
        while (j < tamanho2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Método principal para demonstrar a utilização do Merge Sort.
     */
    public static void main(String[] args) {
        // Array de exemplo a ser ordenado.
        int[] dados = {12, 11, 13, 5, 6, 7};

        System.out.println("Array original:");
        // Imprime o array antes da ordenação.
        for (int n : dados) {
            System.out.print(n + " ");
        }

        // Cria uma instância da classe MergeSortExemplo.
        MergeSortExemplo mergeSort = new MergeSortExemplo();
        // Chama o método de ordenação com o array e seus limites.
        mergeSort.sort(dados, 0, dados.length - 1);

        System.out.println("\nArray ordenado:");
        // Imprime o array depois da ordenação.
        for (int n : dados) {
            System.out.print(n + " ");
        }
    }
}