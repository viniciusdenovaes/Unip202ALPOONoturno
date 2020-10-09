package mavenpackage;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Types;

public class BooksCarosDAO {
    
    private final String SQL = "{? = call get_livros_caros(?)}";

    public List<Book> getListaDeLivrosCaros() {

        List<Book> books = new ArrayList<Book>();

        try {

            Connection conn = ConexaoDB.getConnection();
            conn.setAutoCommit(false);

            CallableStatement func = conn.prepareCall(SQL);
            func.registerOutParameter(1, Types.OTHER);
            func.setFloat(2, 60.0f);
            func.execute();

            ResultSet rs = (ResultSet) func.getObject(1);

            while(rs.next()) {
                Book b = new Book();
                b.setTitle(rs.getString("title"));
                b.setIsbn(rs.getString("isbn"));
                b.setPublisherId(rs.getInt("publisher_id"));
                b.setPrice(rs.getFloat("price"));

                books.add(b);

            }

            rs.close();
            func.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível obter a listagem dos livros caros: " + e.getMessage());
        }

        return books;
    }
}
