import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException{

        Class.forName("com.mysql.cj.jdbc.Driver");

        String connectionString = "jdbc:mysql://localhost:3306/invoice_manager?user=root&password=c0nygre";

        try (
            Connection connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM customer");
            ){
            }

            for (Customer c: customers
                 ) {
                System.out.println(c);
            }

        }
        catch (Exception e ){
            System.out.println(e);
        }

    }

}
