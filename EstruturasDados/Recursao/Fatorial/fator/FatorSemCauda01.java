import javax.swing.*;
import java.awt.*;

public class FatorSemCauda01 {

    public static Component fatorial(int n, int x, int f){
        if (x == 0 || x == 1){
            System.out.println("o fatorial de "+n+" é igual a "+f);
        }else {
            fatorial(n, x-1, f*x);
        }
        return null;
    }

    public static void main(String[] args) {

        int nro;
        nro = Integer.parseInt(JOptionPane.showInputDialog("digite o numero"));
        fatorial(nro, nro, 1);
        JOptionPane.showMessageDialog(fatorial(nro, nro, 1), null);
        System.exit(0);


    }
}
