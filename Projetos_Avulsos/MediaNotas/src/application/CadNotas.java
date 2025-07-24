package src.application;

import src.entities.Prova;
import src.entities.SisProvas;

public class CadNotas {

    public static void main(String[] args) {

            Prova prova1 = new Prova("Nicholas", "Geografia", 10);

            SisProvas sisProvas = new SisProvas();
            sisProvas.addNotas(prova1);

            sisProvas.display();

            sisProvas.mediaNotas();
            sisProvas.notaBonus();
        }

    }
