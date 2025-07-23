import io.github.cdimascio.dotenv.Dotenv;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class App {
    static Dotenv dotenv = Dotenv.load();

    private static final String URL = dotenv.get("CONNECTION_STRING");
    private static final String USER = dotenv.get("USER_NAME");
    private static final String KEY = dotenv.get("KEY_NAME");

    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement stm;

        try{
            conn = DriverManager.getConnection(URL,USER, KEY);
            System.out.println("conectado");

            boolean running = true;
            while (running){

                System.out.print("===== Registro de Produtos =====\n");
                System.out.println("1. Registro");
                System.out.println("2. Remover");
                System.out.println("3. Listar Produtos");
                System.out.println("4. Sair");

                switch (input.next()){
                    case "1":
                        stm = conn.prepareStatement("INSERT INTO teste1 VALUES (?,?,?)");
                        System.out.println("Insira os dados do produto: \n");
                        System.out.print("ID: ");
                        stm.setString(1, input.next());
                        System.out.print("Nome: ");
                        stm.setString(2, input.next());
                        System.out.print("Valor: ");
                        stm.setDouble(3, input.nextDouble());
                        stm.executeUpdate();
                        System.out.println("Produto adicionado com sucesso!");
                        break;

                    case "2":
                        stm = conn.prepareStatement("DELETE FROM teste1 WHERE id = ?");
                        System.out.println("Qual produto deseja remover?");
                        System.out.print("ID: ");
                        stm.setString(1, input.next());
                        stm.executeUpdate();
                        break;

                    case "3":
                        stm = conn.prepareStatement("SELECT * FROM teste.teste1");
                        ResultSet rs = stm.executeQuery(); // <--- CORREÇÃO AQUI!

                        while (rs.next()) {
                            // Exemplo: assumindo que teste1 tem uma coluna 'id' e 'nome'
                            String nome = rs.getString("nome");
                            System.out.println("Nome: " + nome);
                        }
                        rs.close();
                        break;
                    case "4":
                        running = false;

                }

            }


        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        }finally {
            try {
                if (conn != null ){
                    conn.close();
                    System.out.println("Conexão encerrada!");
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão "+e.getMessage());
            }
        }

    }
}
