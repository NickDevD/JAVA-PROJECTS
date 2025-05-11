public class Operacoes {
    int soma;
    int subtracao;
    int multi;
    double div;

    public Operacoes(){

    }

    public Operacoes(int soma, int subtracao, int multi, double div){
        this.soma = soma;
        this.subtracao = subtracao;
        this.div = div;
        this.multi = multi;
    }

    public double somar(int x, int y) {
        return x + y;
    }
}
