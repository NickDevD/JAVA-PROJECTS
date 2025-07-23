package Arrays_Simples.src;

public class Alfabeto {
    public static void main(String[] args) {

        char[] alfa = new char[26];

        for (int alf = 0; alf < alfa.length; alf++) {
            alfa[alf] = (char) ('a' + alf);
        }

        for (char a : alfa){
            System.out.println(a);
        }

    }
}
