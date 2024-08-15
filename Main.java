import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            AutorDAO autorDAO = new AutorDAO();
            LivroDAO livroDAO = new LivroDAO();

            // Exemplo: Inserir um autor
            Autor autor = new Autor();
            autor.setNome("J.K. Rowling");
            autor.setNacionalidade("Britânica");
            autorDAO.inserirAutor(autor);

            // Exemplo: Listar todos os autores
            List<Autor> autores = autorDAO.listarAutores();
            for (Autor a : autores) {
                System.out.println("Autor: " + a.getNome() + ", Nacionalidade: " + a.getNacionalidade());
            }

            // Exemplo: Inserir um livro
            Livro livro = new Livro();
            livro.setTitulo("Harry Potter e a Pedra Filosofal");
            livro.setAnoPublicacao(1997);
            livro.setIdAutor(1); // Certifique-se de que o ID do autor existe
            livroDAO.inserirLivro(livro);

            // Exemplo: Listar todos os livros
            List<Livro> livros = livroDAO.listarLivros();
            for (Livro l : livros) {
                System.out.println("Livro: " + l.getTitulo() + ", Ano: " + l.getAnoPublicacao());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
