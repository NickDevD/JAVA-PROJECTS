import java.util.Arrays;

// A classe 'QuickSortExemplo' contém todo o nosso código.
public class QuickSortExemplo {

    // O método 'quickSort' é o ponto de entrada principal para a ordenação. Ele é recursivo e divide o array em sub-partes.
    // Recebe o array e os índices de início e fim da sub-lista a ser ordenada.
    public static void quickSort(int[] array, int inicio, int fim) {
        // A condição 'if (inicio < fim)' é o ponto de parada da recursão. A ordenação continua apenas se a sub-lista
        // tiver dois ou mais elementos. Se houver apenas um ou nenhum, ela já está ordenada.
        if (inicio < fim) {
            // O método 'particionar' é chamado para encontrar a posição correta do pivô e reorganizar os elementos.
            // Ele retorna o índice final do pivô, que é armazenado em 'indicePivo'.
            int indicePivo = particionar(array, inicio, fim);

            // As duas chamadas abaixo são a parte "dividir para conquistar" do algoritmo.
            // A primeira chamada ordena a sub-lista que está à esquerda do pivô. O novo fim é 'indicePivo - 1',
            // pois o pivô já está em sua posição correta.
            quickSort(array, inicio, indicePivo - 1);

            // A segunda chamada ordena a sub-lista que está à direita do pivô. O novo início é 'indicePivo + 1'.
            quickSort(array, indicePivo + 1, fim);
        }
    }

    // O método 'particionar' é responsável por reorganizar a sub-lista em torno do pivô.
    public static int particionar(int[] array, int inicio, int fim) {
        // O último elemento da sub-lista é escolhido como o pivô de referência.
        int pivo = array[fim];

        // A variável 'i' é usada para rastrear a posição do último elemento encontrado que é menor ou igual ao pivô.
        // Ela começa na posição anterior ao início da sub-lista.
        int i = (inicio - 1);

        // Este laço percorre a sub-lista, do início até o elemento anterior ao pivô.
        for (int j = inicio; j < fim; j++) {
            // Se o elemento na posição 'j' for menor ou igual ao valor do pivô...
            if (array[j] <= pivo) {
                // ...'i' é incrementado, apontando para a próxima posição disponível para um elemento menor.
                i++;
                // Em seguida, o elemento na posição 'j' (que é menor que o pivô) e o elemento na posição 'i'
                // são trocados. Isso garante que todos os elementos menores que o pivô se movam para a esquerda.
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Após o laço, todos os elementos menores que o pivô estão à esquerda do índice 'i'.
        // Agora, o pivô (que está no 'fim') é trocado com o elemento na posição 'i + 1', que é a primeira
        // posição após os elementos menores. Isso coloca o pivô em sua posição final e correta.
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        // Finalmente, o método retorna o índice do pivô.
        return i + 1;
    }

    // O método 'main' é o ponto de partida do programa.
    public static void main(String[] args) {
        // Declara e inicializa o array que será ordenado.
        int[] meuArray = {10, 80, 30, 90, 40, 50, 70};

        // Imprime o array na sua forma original.
        System.out.println("Array desordenado: " + Arrays.toString(meuArray));

        // Chama o método 'quickSort' para iniciar a ordenação do array completo.
        quickSort(meuArray, 0, meuArray.length - 1);

        // Imprime o array após a ordenação para mostrar o resultado final.
        System.out.println("Array ordenado: " + Arrays.toString(meuArray));
    }
}