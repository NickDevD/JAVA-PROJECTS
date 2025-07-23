package src;

public class Empregado {

    //Atributos
    private String nome;
    private String cpf;
    private float salario;

    //Construtor
    public Empregado(String nome, String cpf, float salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public Empregado(){
        this.nome = "";
        this.cpf = "";
        this.salario = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void ApresentarEmp(){
        System.out.println("Nome " + nome);
        System.out.println("Nome " + cpf);
        System.out.println("Nome " + salario);
    }

    public float aumentoSal(){
        return salario + 100;
    }
}
