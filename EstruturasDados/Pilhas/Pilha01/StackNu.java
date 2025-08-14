import java.util.Stack;
public class StackNu {

    static void main() {
        Stack<Integer> n = new Stack<>();
        int MAX_SIZE = 3;

        StackNu p = new StackNu();
        p.inserir(n, 2, MAX_SIZE);
        p.inserir(n, 3, MAX_SIZE);
        p.inserir(n, 4, MAX_SIZE);
        p.inserir(n, 5, MAX_SIZE);
        p.inserir(n, 6, MAX_SIZE);

    }

    public void inserir(Stack<Integer> p, int n, int MAX){
        if(p.size() >= MAX){
            System.out.println("Cheio");
        }else {
            int v = p.push(n);
            System.out.println("inseriu "+v);
        }

    }

}
