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
            if (n == name){
                System.out.println("Já adicionado");
                return;
            }
        }
        nomes.add(name);
        System.out.println(name+" adicionado");
    }

    public void remover(String n){
        nomes.remove(n);
    }

    public void mostrar(){
        for (String nome : nomes){
            System.out.println(nome);
        }
    }

    static void main() {
        ListaConvidados l = new ListaConvidados();

        l.adicionarConvidado("Nick");
        l.adicionarConvidado("Nick");

        l.mostrar();
    }
}
