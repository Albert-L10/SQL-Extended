import java.sql.*;
import java.sql.DriverManager;

public class SqlJDBC {

    public static void main(String [] args) throws SQLException, ClassNotFoundException {
        //String url="jdbc:mysql://localhost:3306";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/umuzi", "root", "1234");
            Statement statement = con.createStatement();


        String query="select * from umuzi.customer";

        ResultSet result=statement.executeQuery(query);

        while(result.next())
        {
            System.out.println(result.getInt("customerID")+""+result.getString("FirstName")+""
            +result.getString("LastName")+""+result.getString("Gender")+""+result.getString("Address")
            +""+result.getString("Phone")+""+result.getString("Email")+""+result.getString("City")
            +""+result.getString("Country"));
        }

        con.close();
    }
}
