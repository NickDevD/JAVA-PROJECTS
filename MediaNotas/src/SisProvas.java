import java.util.ArrayList;

public class SisProvas  {

    ArrayList<Prova> notas;

    public SisProvas(){
        notas = new ArrayList<>();
    }

    public void addNotas(Prova prova){
        notas.add(prova);
        System.out.println("Nota do aluno " + prova.getNome() + " adicionada");
    }

    public void removeNotas(Prova prova1){
        notas.remove(prova1);
        System.out.println("Prova do aluno "+ prova1.getNome()+" removida");
    }

    public void display(){

    }

}
