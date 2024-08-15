import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO {

    public void inserirAutor(Autor autor) throws SQLException {
        String sql = "INSERT INTO Autor (Nome, Nacionalidade) VALUES (?, ?)";
        try (Connection conn = ConexaoBD.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getNacionalidade());
            stmt.executeUpdate();
        }
    }

    public void atualizarAutor(Autor autor) throws SQLException {
        String sql = "UPDATE Autor SET Nome = ?, Nacionalidade = ? WHERE ID_Autor = ?";
        try (Connection conn = ConexaoBD.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getNacionalidade());
            stmt.setInt(3, autor.getIdAutor());
            stmt.executeUpdate();
        }
    }

    public void excluirAutor(int idAutor) throws SQLException {
        String sql = "DELETE FROM Autor WHERE ID_Autor = ?";
        try (Connection conn = ConexaoBD.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idAutor);
            stmt.executeUpdate();
        }
    }

    public List<Autor> listarAutores() throws SQLException {
        List<Autor> autores = new ArrayList<>();
        String sql = "SELECT * FROM Autor";
        try (Connection conn = ConexaoBD.getInstance().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Autor autor = new Autor(
                        rs.getInt("ID_Autor"),
                        rs.getString("Nome"),
                        rs.getString("Nacionalidade")
                );
                autores.add(autor);
            }
        }
        return autores;
    }
}
