import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static ConexaoBD instance;
    private Connection connection;

    private ConexaoBD() {
        try {
            // Configurações da conexão com o banco de dados
            String url = "jdbc:mysql://localhost:3306/nome_do_banco";
            String user = "usuario";
            String password = "senha";
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ConexaoBD getInstance() {
        if (instance == null) {
            instance = new ConexaoBD();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
