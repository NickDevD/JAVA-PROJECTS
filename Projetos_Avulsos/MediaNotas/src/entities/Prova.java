package src.entities;

public class Prova {
    private String nome;
    private String materia;
    private double nota;

    public Prova(String nome, String materia, double nota){
        this.materia = materia;
        this.nota = nota;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
