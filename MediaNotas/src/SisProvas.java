import java.util.ArrayList;

public class SisProvas {

    ArrayList<Prova> notas;

    public SisProvas(){
        notas = new ArrayList<>();
    }

    public void addNotas(Prova prova){
        notas.add(prova);
        System.out.println("Nota do aluno " + prova.getNome() + " adicionada");
    }

    public void removeNotas(Prova prova){
        notas.remove(prova);
        System.out.println("Prova do aluno "+ prova.getNome()+" removida");
    }
}
