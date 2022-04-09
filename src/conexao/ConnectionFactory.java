package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @authors Maíra & Rafael
 */
public class ConnectionFactory 
{
    public Connection getConnection()
    {
        try
        {
            String url = "jdbc:postgresql://localhost:5432/teste";
            String user = "postgres";
            String password = "mairabd";
            return DriverManager.getConnection(url, user, password);
        }
        catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
            throw new RuntimeException();
        }
    }
}