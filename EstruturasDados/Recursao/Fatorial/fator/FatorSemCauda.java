public class FatorSemCauda {

    public static void fatorial(int numero, int f){
        if (numero > 1){
            fatorial(numero - 1, f*numero);
        }else {
            System.out.println("O fatorial é "+f);
        }
    }

    static void main() {
        int f = 1;
        fatorial(3,f);
    }

}
