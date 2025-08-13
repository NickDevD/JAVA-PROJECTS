public class MediaNotas {

    public static void main(String[] args) {
        double[] notas = {
                7.5, 8.2, 6.0, 9.1, 5.5, 7.0, 8.7, 4.3, 9.0, 5.9,
                6.8, 7.1, 5.4, 8.9, 6.2, 9.3, 5.8, 7.7, 4.9, 8.0,
                7.2, 5.1, 6.6, 8.4, 9.5, 7.8, 6.3, 8.6, 5.0, 7.9,
                9.2, 6.7, 5.3, 7.3, 8.8, 4.7, 9.4, 5.6, 7.4, 6.5,
                8.3, 4.5, 9.6, 5.7, 7.6, 6.1, 8.5, 4.8, 9.7, 5.2
        };

        calcularMedia(notas);
    }

    public static void calcularMedia(double[] vetor) {

        double soma = 0;
        for(double v : vetor){
            soma += v;

        }
        double media = soma/vetor.length;
        System.out.println(media);
    }
}