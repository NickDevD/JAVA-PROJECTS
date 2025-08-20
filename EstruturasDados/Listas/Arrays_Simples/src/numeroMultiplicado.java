package Arrays_Simples.src;

public class numeroMultiplicado {
    public static void main(String[] args) {
        
        Integer[] numeros = new Integer[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.println(i*2);
        }
    }
}
