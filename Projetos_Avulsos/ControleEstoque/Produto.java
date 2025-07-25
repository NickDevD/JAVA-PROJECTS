public class Produto {
    String nome;
    int quantidade;

    public Produto(String nome, int quantidade){
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void addProduto(int quantidade){
        this.quantidade = this.quantidade + quantidade;
        System.out.println("Produto adicionado" + this.quantidade);
    }
}
