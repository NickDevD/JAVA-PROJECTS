package src;

import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        int year = 2025;
        int mouth = 5;
        int day = 7;

        cal.set(year,mouth-1, day );
        int diaDaSemana = cal.get(Calendar.DAY_OF_WEEK);


        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        System.out.println(dias[diaDaSemana]);
    }
}
