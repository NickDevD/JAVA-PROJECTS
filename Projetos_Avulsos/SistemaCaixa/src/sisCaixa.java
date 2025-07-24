package src;

import java.util.ArrayList;
import java.util.List;

public class sisCaixa {

    List<Produto> produtosList;

    public sisCaixa() {
        produtosList = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        produtosList.add(produto);
    }

    public void removeProduto(Produto produto) {
        produtosList.remove(produto);
        System.out.println(STR."\{produto.getNome()} removido com sucesso");
    }

    public void listarProdutos() {
        int seq = 0;
        for (Produto produto : produtosList) {
            seq++;
            System.out.println(STR."\{seq}.\{produto.getNome()}");
        }
    }
}
