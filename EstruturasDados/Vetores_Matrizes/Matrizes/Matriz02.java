public class Matriz02 {
    public static void main(String[] args) {

        int[][] pessoaIdade = {
                {31},
                {30}
        };

        String[] pessoaNome = {"Nick", "Gabi"};

        for (int i = 0; i < pessoaIdade.length; i++) {
            System.out.println(pessoaNome[i]); // verifica quais os nomes das pessoas

            for (int j = 0; j < pessoaIdade[j].length; j++) { // pessoaIdade[i] representa a quandidade de pessoas que vão receber as idades neste loop
                System.out.println(pessoaIdade[i][j]); // Pega a idade e vincula aos nomes linha / coluna
            }
        }
    }
}
