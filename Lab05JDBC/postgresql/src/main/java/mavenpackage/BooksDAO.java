package mavenpackage;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BooksDAO {
    
    private final String SQL = "SELECT * FROM books";

    public List<Book> getListaDeLivros() {

        List<Book> books = new ArrayList<Book>();

        try {

            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {

                Book b = new Book();
                b.setTitle(rs.getString("title"));
                b.setIsbn(rs.getString("isbn"));
                b.setPublisherId(rs.getInt("publisher_id"));
                b.setPrice(rs.getFloat("price"));

                books.add(b);

            }

            rs.close();
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível obter a listagem dos livros: " + e.getMessage());
        }

        return books;
    }
}
