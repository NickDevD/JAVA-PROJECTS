public class ListaFixa {
    public static void main(String[] args) {

        String[] nomes = {"Nick", "Gabi", "Mike"};

        int seq = 0;
        for (String nome : nomes){
            seq++;
            System.out.println(nome);
        }
    }
}
