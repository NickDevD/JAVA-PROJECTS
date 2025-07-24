package src;

public class Objeto {
    String nome;
    int quantidade;

    public Objeto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }


    public void addQuantidade(int quantidade){
        this.quantidade = this.quantidade + quantidade;
        System.out.println("Quantidade adicionada " + quantidade);
    }

    public void removerQuantidade(int quantidade){
        this.quantidade = this.quantidade - quantidade;
        System.out.println("Quantidade removida " + quantidade + " quantidade atual:"+ getQuantidade());
    }
}
