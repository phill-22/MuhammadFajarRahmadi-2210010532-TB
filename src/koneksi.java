import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 import javax.swing.JOptionPane;
/**
 *
 * @author ASUS ROG
 */
public class koneksi {
    private static Connection mysqlkoneksi;
    public static Connection koneksiDB() throws SQLException{
            if (mysqlkoneksi==null) {
                try {
                   String DB="jdbc:mysql://localhost:3306/ppdb";
                    String user="root";
                    String pass="";
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkoneksi=(Connection) DriverManager.getConnection(DB,user,pass);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "koneksi gagal");
                }
                    
            } return mysqlkoneksi;
            
        }
    
}
