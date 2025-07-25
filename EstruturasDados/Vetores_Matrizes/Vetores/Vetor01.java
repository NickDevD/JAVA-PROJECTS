public class Vetor01 {
    int[] vetor;

    public Vetor01() {
        vetor = new int[10];
    }

    public void media(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 1;
            soma += vetor[i];
        }
        System.out.println("media final "+soma);
    }

    public static void main(String[] args) {

        Vetor01 v = new Vetor01();

        v.media(new int[100]);

    }
}
