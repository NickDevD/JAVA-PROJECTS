package main.java;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner in = new Scanner(System.in);

        String id = in.next();
        String name = in.next();
        String cpf = in.next();


        Connection conn;
        PreparedStatement stmt;
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/controlecli", "root", "admin");
        stmt = conn.prepareStatement("INSERT INTO clientes VALUES (?, ?, ?)");

        stmt.setString(1,id);
        stmt.setString(2,name);
        stmt.setString(3,cpf);
        stmt.executeUpdate();

    }
}
