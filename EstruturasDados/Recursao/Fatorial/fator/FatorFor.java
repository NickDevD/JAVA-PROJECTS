public class FatorFor {

    public static long calcularFatorial(int numero){
        if(numero == 0){
            return 1;
        }
        long f = 0;
        for(int i = 0; i <= numero; i++){
           f = numero * calcularFatorial(numero-1);
        }
        return f;
    }

    static void main() {
        int n = 5;
        System.out.println(calcularFatorial(n));
    }
}
