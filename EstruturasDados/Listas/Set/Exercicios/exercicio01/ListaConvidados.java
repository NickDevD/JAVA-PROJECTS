import java.util.HashSet;

public class ListaConvidados {

    HashSet<String> nomes;

    private ListaConvidados(){
        nomes = new HashSet<>();
    }

    public void adicionarConvidado(String name){
        if (name == null || name.trim().isEmpty()){
            System.out.println("Necessário inserir um nome");
            return;
        }
        for (String n : nomes){
            if (n.equals(name)){
                System.out.println("Já adicionado");
                return;
            }
        }
        nomes.add(name);
        System.out.println(name+" adicionado");
    }

    public void contarConvidados(){
        System.out.println(nomes.size());
    }

    public void verificarConvidado(String n){
        for (String no:nomes){
            if (no.equals(n)){
                System.out.println("True");
                return;
            } else {
                System.out.println("False");
                return;
            }
        }
    }

    public void remover(String n){
        nomes.remove(n);
    }

    public void mostrar(){
        for (String nome : nomes){
        }
        System.out.println(nomes);
    }

    static void main() {
        ListaConvidados l = new ListaConvidados();

        l.adicionarConvidado("Nick");
        l.adicionarConvidado("Gabi");
        l.adicionarConvidado("Mike");

        l.contarConvidados();

        l.mostrar();
    }
}
