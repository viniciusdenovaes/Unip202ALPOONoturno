package mavenpackage;

import java.util.Properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    private static final String USUARIO = "hermano";
    private static final String SENHA = "hermano";

    private static final String HOST = "localhost";
    private static final String DATABASE = "unip";
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        try {

            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://" + HOST + "/" + DATABASE;
            Properties props = new Properties();
            props.setProperty("user", USUARIO);
            props.setProperty("password", SENHA);

            return DriverManager.getConnection(url, props);

        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException("Driver JDBC do PostgreSQL não loalizado: " + e.getMessage());
        } catch (SQLException e) {
            throw new SQLException("Não foi possível conectar com o banco de dados " + DATABASE + ": " + e.getMessage());
        }
    }
}
