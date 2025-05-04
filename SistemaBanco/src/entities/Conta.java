package entities;

public abstract class Conta {
    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo){
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }

    // Método sacar: Este método adiciona a função de saque, onde um valor do tipo double deve ser informado
    public double sacar(double valor){
        if (valor >= 1000){
           throw  new RuntimeException("Limite de saque alcançado");
        }else{
            saldo -= valor;
            throw new RuntimeException("Saque concluído");
        }
    }
    // Método depositar: Este método adiciona a função de saque, onde um valor do tipo double deve ser informado
    public double depositar(double valor){
        saldo += valor;
        if (valor <= 0){
            throw new RuntimeException("Insira um valor maior que zero");
        }else {
            System.out.println("Depósito concluído");
            throw new RuntimeException("Novo saldo " + saldo);
        }
    }

    public double transferir(double valor, ContaPoupanca contaPoupanca){
        if (saldo <= 0){
            throw new RuntimeException("Saldo insuficiente");
        }else {
            contaPoupanca.depositar(valor);
            throw new RuntimeException("Transferência concluída");
        }
    }


}
