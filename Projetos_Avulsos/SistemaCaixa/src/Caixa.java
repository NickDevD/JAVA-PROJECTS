package src;

public class Caixa {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 001, 5.49);
        produto1.setId(002);
        Produto produto2 = new Produto("Feijão", 002, 5.49);


        sisCaixa c1 = new sisCaixa();
        c1.addProduto(produto1);
        c1.addProduto(produto2);

        c1.removeProduto(produto2);

        c1.listarProdutos();
    }
}
