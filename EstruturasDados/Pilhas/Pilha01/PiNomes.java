import java.sql.SQLOutput;
import java.util.Stack;

public class PiNomes {
    Stack<String> nomes = new Stack<>();

    public void push(String nome) {
            nomes.push(nome);
            System.out.println("Empilhou: "+nome);
    }

    public void peek() {
        String nome = nomes.peek();
        System.out.println(nome);
    }

    public void pop() {
        String nome = nomes.pop();
        System.out.println(nomes);
    }

    public static void main(String[] args) {

        PiNomes p = new PiNomes();

        p.push("John");
        p.push("Nick");


        p.peek();

        p.pop();

    }
}
