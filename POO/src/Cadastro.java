package src;

public class Cadastro {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setSalario(2000);

        System.out.println(empregado.aumentoSal());

    }
}
