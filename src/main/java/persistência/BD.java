package persistência;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
    static final String URL_BD = "jdbc:mysql://localhost/amigos";
    static final String USUÁRIO = "root";
    static final String SENHA = "63823710";
    public static Connection conexão = null;
    
    public static void criaConexão() {
        try {
            conexão = DriverManager.getConnection(URL_BD, USUÁRIO, SENHA);
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace(); }
    }
    
    public static void fechaConexão() {
        try {
            conexão.close();
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace(); }
    }
}
