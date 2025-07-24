package src;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Carta> cartas;

    public Deck() {
        cartas = new ArrayList<>();
    }

    // Método para adicionar uma única carta ao deck
    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
        System.out.println(carta + " foi adicionada ao deck.");
    }

    // Método para adicionar várias cartas ao deck
    public void adicionarCartas(List<Carta> novasCartas) {
        cartas.addAll(novasCartas);
        System.out.println(novasCartas.size() + " cartas foram adicionadas ao deck.");
    }

    // Método para mostrar todas as cartas presentes no deck
    public void mostrarDeck() {
        if (cartas.isEmpty()) {
            System.out.println("O deck está vazio.");
        } else {
            System.out.println("Cartas no deck:");
            for (Carta carta : cartas) {
                carta.mostrarCarta();
            }
        }
    }

}