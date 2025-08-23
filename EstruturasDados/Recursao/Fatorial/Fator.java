public class Fator {

    public static long fator(int n){
        if (n == 0){
            return 1;
        }
        else {
            return n * fator(n-1);
        }
    }

    static void main() {

        System.out.println(fator(5));
    }
}
