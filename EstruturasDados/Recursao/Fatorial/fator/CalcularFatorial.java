public class CalcularFatorial {

    public static long calcularFatorial(int numero){
        if(numero == 0){
           return 1;
        }else{
         return numero * calcularFatorial(numero-1);

        }
    }

    static void main() {
        int numero = 5;
        long resultado = calcularFatorial(numero);
        System.out.println(resultado);
    }
}
