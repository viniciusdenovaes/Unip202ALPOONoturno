package mavenpackage;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ListaLivros extends JFrame {
    
    private DefaultTableModel model = new DefaultTableModel();

    private JTable tabela;
    private JScrollPane rolagem;
    private JPanel fundo;

    public ListaLivros() {
        super("Livros");
        criaJTable();
    }

    private void criaJTable() {

        model.addColumn("title");
        model.addColumn("isbn");
        model.addColumn("publisher_id");
        model.addColumn("price");

        model.setNumRows(0);

        BooksDAO dao = new BooksDAO();
        for (Book b : dao.getListaDeLivros()) {
            model.addRow(
                new Object[] {
                    b.getTitle(),
                    b.getIsbn(),
                    b.getPublisherId(),
                    b.getPrice()
                }
            );
        }

        tabela = new JTable (model);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(400);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(60);
    }

    public void criaJanela() {

        rolagem = new JScrollPane(tabela);
        fundo = new JPanel();
        fundo.setLayout(new BorderLayout());
        fundo.add(BorderLayout.CENTER, rolagem);
        getContentPane().add(fundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 320);
        setVisible(true);
    }
}
