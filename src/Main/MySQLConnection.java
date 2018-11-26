package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wiguna R
 */
public class MySQLConnection {
    Connection conn = null;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_sysbook","root","");
            return conn;
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, "Not Connected to Databases/Turn on Your Xampp");
            return null;
        }
    
    }
}
