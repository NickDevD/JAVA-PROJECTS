import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class FAQBotGUI extends JFrame implements ActionListener {

    private JTextField inputField;
    private JTextArea outputArea;
    private JButton sendButton;
    private Map<String, String> faqData;

    public FAQBotGUI(Map<String, String> faqData) {
        this.faqData = faqData;

        setTitle("Bot de FAQ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Área de saída para as respostas do bot
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);

        // Painel para a entrada do usuário e o botão de enviar
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputField = new JTextField(25);
        sendButton = new JButton("Enviar");
        sendButton.addActionListener(this); // Escutador de eventos para o botão

        inputPanel.add(inputField);
        inputPanel.add(sendButton);
        add(inputPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton) {
            String perguntaUsuario = inputField.getText().trim();
            inputField.setText(""); // Limpa o campo de entrada

            if (perguntaUsuario.equalsIgnoreCase("sair")) {
                outputArea.append("Bot: Encerrando...\n");
                dispose(); // Fecha a janela
            } else {
                String respostaBot = faqData.get(perguntaUsuario);
                outputArea.append("Você: " + perguntaUsuario + "\n");
                if (respostaBot != null) {
                    outputArea.append("Bot: " + respostaBot + "\n");
                } else {
                    outputArea.append("Bot: Desculpe, não encontrei uma resposta para essa pergunta.\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Carregar o FAQ (você precisa implementar sua função de carregamento aqui)
        Map<String, String> faqData = SimpleFAQBot.carregarFAQ("faq.txt"); // Usando sua função anterior

        // Criar e exibir a interface gráfica na Thread de Eventos Swing
        SwingUtilities.invokeLater(() -> new FAQBotGUI(faqData));
    }
}