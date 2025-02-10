import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        display.frame.setTitle("Handicap Calculator");
        display.frame.setDefaultCloseOperation(3);
        display.frame.setLayout(null);
        display.frame.setResizable(false);
        display.frame.setLocationRelativeTo(null);
        display.frame.setSize(500,300);
        display.frame.setVisible(true);
        display.frame.setLayout(new GridLayout(3,1));

        JTextField txtCasa = new JTextField("Casa");
        txtCasa.setEditable(true);
        txtCasa.setBounds(150,150,100,50);
        txtCasa.setVisible(true);
        display.frame.add(txtCasa);

        JTextField txtFora = new JTextField("Fora");
        txtFora.setEditable(true);
        txtFora.setBounds(150,100,100,50);
        txtFora.setVisible(true);
        display.frame.add(txtFora);

        JTextField txtHandicap = new JTextField("Handicap");
        txtHandicap.setEditable(true);
        txtHandicap.setColumns(10);
        txtHandicap.setBounds(150,200,100,50);
        txtHandicap.setVisible(true);
        display.frame.add(txtHandicap);


        JButton Casa = new JButton();
        Casa.setText("Casa");
        Casa.setBounds(50,50,100,50);
        display.frame.add(Casa);

        JButton Fora = new JButton();
        Fora.setText("Fora");
        Fora.setBounds(50,150,100,50);
        display.frame.add(Fora);


        Casa.addActionListener(e-> {
            // Código a ser executado
            int casa = Integer.parseInt(txtCasa.getText());
            int fora = Integer.parseInt(txtFora.getText());
            double handicap = Double.parseDouble(txtHandicap.getText());

            casa += handicap;

            if (casa > fora) {
                System.out.println("Vence");
            }else{
                System.out.println("Perde");
            }

        });

        Fora.addActionListener(e-> {
            // Código a ser executado
            int casa = Integer.parseInt(txtCasa.getText());
            int fora = Integer.parseInt(txtFora.getText());
            double handicap = Double.parseDouble(txtHandicap.getText());

            fora += handicap;

            if (fora > casa) {
                System.out.println("Vence");
            }else{
                System.out.println("Perde");
            }

        });

    }


}
