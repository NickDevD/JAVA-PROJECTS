import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleFAQBot {

    static Map<String, String> carregarFAQ(String caminhoArquivo) {
        Map<String, String> faq = new HashMap<>();
        try (Scanner scannerArquivo = new Scanner(new File(caminhoArquivo))) {
            while (scannerArquivo.hasNextLine()) {
                String linha = scannerArquivo.nextLine();
                String[] partes = linha.split("\\?", 2); // Divide a linha na primeira ocorrência de '?'
                if (partes.length == 2) {
                    String pergunta = partes[0].trim(); // Remove espaços em branco no início e fim
                    String resposta = partes[1].trim();
                    faq.put(pergunta, resposta);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + caminhoArquivo);
        }
        return faq;
    }

    public static void main(String[] args) {
        Map<String, String> faqData = carregarFAQ("faq.txt");
        Scanner scannerUsuario = new Scanner(System.in);

        System.out.println("Olá! Sou um bot de FAQ simples. Digite sua pergunta (ou 'sair' para encerrar):");

        while (true) {
            System.out.print("> ");
            String perguntaUsuario = scannerUsuario.nextLine();
            if (perguntaUsuario.endsWith("?")) {
                perguntaUsuario = perguntaUsuario.substring(0, perguntaUsuario.length() - 1).trim();
            } else {
                perguntaUsuario = perguntaUsuario.trim();
            }

            if (perguntaUsuario.equalsIgnoreCase("sair")) {
                break;
            }

            String respostaBot = faqData.get(perguntaUsuario); // Busca a pergunta exata no nosso mapa
            System.out.println("Debug: Pergunta digitada: [" + perguntaUsuario + "]");
            System.out.println("Debug: Conteúdo do FAQ: " + faqData);

            if (respostaBot != null) {
                System.out.println("Bot: " + respostaBot);
            } else {
                System.out.println("Bot: Desculpe, não encontrei uma resposta para essa pergunta.");
            }
        }

        scannerUsuario.close();
        System.out.println("Bot encerrado.");
    }
}