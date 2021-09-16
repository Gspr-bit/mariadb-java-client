/*
 * 
 */
package dbui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gspr-bit
 */
public class Dbui {
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
    
    private Conexion con;
    private Connection conex;
    private PreparedStatement st;
    private ResultSet rs;
    private ResultSet consulta;

    public ResultSet getConsulta() {
        return consulta;
    }

    public void setConsulta(ResultSet consulta) {
        this.consulta = consulta;
    }

    public Dbui() {
    }
        
    /**
     * This method calls getHost(), getDb(), getUser() and getPassword()
     * Only the first and the thirth are required, others are optional
     * @see setHost(), getHost(), setDb(), getDb(), setUser(), getUser(), setPassword(), getPassword()
     */
    public void connect() {
        this.con = new Conexion();
        
        con.setHost(getHost());
        con.setDb(getDb());
        con.setUser(getUser());
        con.setPassword(getPassword());
        con.connect();
        
        this.conex = this.con.getConexion();
    }
    
    /**
     * This methid receives the comando variable and executes it as a SQL command
     * @param comando
     * @return "ResultSet" if the statement throws a ResultSet, 
     *  "Ok" if the statements doesn't throws anything and was executed ok
     *  SQLException message
     */
    public String consola(String comando) {
        try {
            this.st = conex.prepareStatement(comando);
            
            if (this.st.execute()) {
                this.rs = this.st.executeQuery();
                setConsulta(this.rs);
                return "ResultSet";
            } else {
                return "Ok";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
}
