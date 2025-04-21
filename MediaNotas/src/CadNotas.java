public class CadNotas {

    public static void main(String[] args) {

        Prova prova1 = new Prova("Nick","Matemática", 8);

        SisProvas sisProvas = new SisProvas();
        sisProvas.addNotas(prova1);

        sisProvas.display();
    }
}
