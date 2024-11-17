package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/calculadora_soap_db"; 
    private static final String USER = "root";
    private static final String PASSWORD = "Bye211221"; 

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void guardarOperacion(int num1, int num2, int resultado, String operacion) {
        String sql = "INSERT INTO operaciones (num1, num2, resultado, operacion) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, num1);
            pstmt.setInt(2, num2);
            pstmt.setInt(3, resultado);
            pstmt.setString(4, operacion);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
