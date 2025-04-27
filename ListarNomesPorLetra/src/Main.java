public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Nick");
        Funcionario funcionario1 = new Funcionario("Naldo");


        ListaFunc listaFunc = new ListaFunc();
        listaFunc.addFunc(funcionario1);
        listaFunc.addFunc(funcionario);
        listaFunc.localizarNome();


    }
}
