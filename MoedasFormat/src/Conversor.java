import java.text.NumberFormat;
import java.util.Locale;

public class Conversor {
    public static void main(String[] args) {


        Locale brLocale = new Locale("pt-br","BR");
        NumberFormat formatBR = NumberFormat.getCurrencyInstance(brLocale);

        String brasil = formatBR.format(8);

        System.out.println(brasil);
    }
}
