import java.util.ArrayList;
import java.util.List;

public class ListaFunc {

    List<Funcionario> funcionarioList;

    public ListaFunc(){
       funcionarioList = new ArrayList<>();
    }

    public void addFunc(Funcionario funcionario){
        funcionarioList.add(funcionario);
        System.out.println("Funcionario adicionado");
    }

    public void localizarNome(){
        for (Funcionario n : funcionarioList){
            if (n.getNome().startsWith("N")){
                System.out.println(n.getNome());
            }
        }
    }

}
