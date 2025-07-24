package src.entities;
import java.util.ArrayList;
import java.util.List;

public class SisProvas  {

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
        sequencia--;
        System.out.println("Prova do aluno "+sequencia+"."+ prova.getNome()+" removida");
    }

    int sequencia = 0;
    public void display(){
        for(Prova prova : notas){
            sequencia++;
            System.out.println(sequencia + "." + prova.getNome());
        }

    }

    public void mediaNotas(){
        double soma = 0;
        for(Prova prova : notas){
            soma += prova.getNota();
        }
        double media = soma / notas.size();
        System.out.println(media);

        }

    public void notaBonus(){
        double notaFinal = 0;
        for (Prova prova : notas){
            if(prova.getNota() >= 6){
              notaFinal = prova.getNota() + 2;
            }else {
                System.out.println("Sem bônus de nota");
            }
        }
        System.out.println("Nota final com bônus: " + notaFinal);

    }

    }


