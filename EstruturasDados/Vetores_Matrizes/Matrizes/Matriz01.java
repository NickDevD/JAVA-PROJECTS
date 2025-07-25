public class Matriz01 {
    public static void main(String[] args) {

        double[][] alunosNotas = {
                // Aluno Nick (Linha 0)       Mat  Port Hist Cien
                {8.5, 7.0, 9.0, 6.5},
                // Aluna Gabi (Linha 1)         Mat  Port Hist Cien
                {7.0, 8.0, 6.0, 9.5}
        };

        String[] alunos = {"Nick", "Gabi"};
        String[] discipplinas = {"Mat", "Geo", "Por", "Cie"};

        for (int i = 0; i < alunosNotas.length; i++) {
                System.out.println(alunos[i]);
            for (int j = 0; j < alunosNotas[i].length; j++) {
                System.out.println("nota: " + discipplinas[j] + ": " + alunosNotas[i][j] );
            }
        }
    }
}
