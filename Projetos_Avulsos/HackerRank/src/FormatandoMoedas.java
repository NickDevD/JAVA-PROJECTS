package src;

import java.util.*;
import java.text.*;

public class FormatandoMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = inFormat.format(payment);

        Locale brLocale = new Locale("pt-br", "BR");
        NumberFormat brFormat = NumberFormat.getCurrencyInstance(brLocale);
        String br = brFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India:  " + india);
        System.out.println("Brazil: " + br);

    }


}