import java.util.Stack;

public class StackNome {
    public static void main(String[] args) {

        Stack<String> nomes = new Stack<>();

        System.out.println("--------------------"); // Adiciona elementos a pilha
        nomes.push("Jose");
        nomes.push("Maria");
        nomes.push("João");

        int contador=0;
        for (String nome : nomes) {
            contador++;
            System.out.println(contador+"."+nome); // Conta os elementos e retorna todos eles
        }

        System.out.println("--------------------");
        String n = nomes.pop();
        System.out.println("Rmovido: "+contador+"."+n); // Remove o elemento do topo da pilha

        System.out.println("--------------------");
        String n2 = nomes.peek();
        System.out.println("Topo da pilha: "+contador+"."+n2); // Verifica o elemento no topo da pilha e o retorna

        System.out.println("--------------------"); // Verifica se a pilha está vazia
        Boolean v = nomes.empty();
        System.out.println("Pilha está vazia? "+ v);

        int search = nomes.search("Jose"); // Busca o elemento com base em um parâmetro
        System.out.println(search);

    }
}
