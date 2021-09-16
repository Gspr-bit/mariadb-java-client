/*
 * 
 */
package dbui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Gspe-bit
 */
public class Conexion {
    private Connection conex;
    private String host;
    private String db;
    private String user;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
       
    /** 
     * This method calls getHost(), getDb(), getUser() and getPassword()
     * Only the first and the thirth are required, others are optional
     * @see setHost(), getHost(), setDb(), getDb(), setUser(), getUser(), setPassword(), getPassword()
     */
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conex = DriverManager.getConnection("jdbc:mysql://" + getHost() + "/" + getDb(),getUser(),getPassword());
            System.out.println("Ok");
            
        } catch(SQLException | ClassNotFoundException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            System.out.println(ex.getMessage());
            
            JOptionPane.showMessageDialog(null, "Cannot connect with the server\n" + ex.getMessage());
            System.exit(0);
        }
    }
    
    public Connection getConexion() {
        return this.conex;
    }
    
    public void cerrarConexion() {
        try {
            this.conex.close();
        } catch(SQLException ex) {
            ex.getStackTrace();
        }
    }
}
