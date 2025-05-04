public class Finaciamento {
    private Double valorTotal;
    private Double entrada;
    private Integer parcelas;

    public Finaciamento(Double valorTotal, Double entrada, Integer parcelas){

        // Toda a lógica de negócio foi adicionada no próprio construtor
        if(entrada < valorTotal * 0.2){
            throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total");
        } else if (parcelas < 6) {
            throw new RuntimeException("o número mínimo de pparcelas deve ser 6");
        }

        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao(){
        System.out.print("Valor da prestação; R$");
      return (valorTotal - entrada) / parcelas;
    }


}
