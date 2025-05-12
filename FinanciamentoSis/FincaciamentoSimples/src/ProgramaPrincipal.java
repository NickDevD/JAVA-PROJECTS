public class ProgramaPrincipal {
    public static void main(String[] args) {

        double valorTotal = 1000;
        double entrada = 200;
        int parcelas = 12;

        try{
            Finaciamento finaciamento = new Finaciamento(valorTotal, entrada, parcelas);
            System.out.printf("%.2f",finaciamento.prestacao());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
