package src;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    public static void main(String[] args) {
        // Criar um deck
        Deck meuBaralho = new Deck();

        // Criar algumas cartas
        Carta carta1 = new Carta("Ás", Math.random() );


        // Adicionar cartas ao deck
        meuBaralho.adicionarCarta(carta1);

        // Mostrar as cartas no deck
        meuBaralho.mostrarDeck();
    }
}