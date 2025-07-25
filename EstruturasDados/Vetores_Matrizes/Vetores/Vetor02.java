
public class Vetor02 {
    public static void main(String[] args) {

        int[] vetorObj;

        vetorObj = new int[100];

        int soma = 0;
            for (int vetor = 0; vetor <= 100 -1; vetor++) {
                vetorObj[vetor] = 2;
                soma += vetorObj[vetor];
            }
        System.out.println(soma);

    }
}

