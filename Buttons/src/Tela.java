import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame {
    public Tela() {
        setTitle("Handicap Claculator");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel panelButtons = new JPanel(new GridLayout(1,2));
        JButton btnCasa = new JButton("Casa");
        JButton btnFora = new JButton("Fora");
        panelButtons.add(btnCasa);
        panelButtons.add(btnFora);

        JPanel panelText = new JPanel(new GridLayout(3,1));
        JTextField txtCasa = new JTextField();
        JTextField txtFora = new JTextField();
        JTextField txtHandicap = new JTextField();
        panelText.add(txtCasa);
        panelText.add(txtFora);
        panelText.add(txtHandicap);

        JPanel panelLabeltxt = new JPanel(new GridLayout(3,1));
        JLabel lblCasa = new JLabel("Casa");
        JLabel lblFora = new JLabel("Fora");
        JLabel lblHandicap = new JLabel("Handicap");
        panelLabeltxt.add(lblCasa);
        panelLabeltxt.add(lblFora);
        panelLabeltxt.add(lblHandicap);

        add(panelButtons, BorderLayout.CENTER);
        add(panelText, BorderLayout.NORTH);
        add(panelLabeltxt, BorderLayout.AFTER_LAST_LINE);

        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Tela();
    }
}


