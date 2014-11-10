package conexión;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class Conexion: This class make posible connect to the database
 * @author rafa
 */
public class Conexion {

    private Connection con = null;
    private String url = null;
    private String user = null;
    private String pass = null;

    /**
     * Default constructor to a local Database
     */
    public Conexion() {

        try {

            this.url = "jdbc:mysql://localhost/sgbd";
            this.user = "root";
            this.pass = "reliquias";

            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Fallo de conexión");
        }
    }

    /**
     * Close connection from database
     */
    public void desconectar() {
        try {
            this.con.close();
            System.out.println("Conexión cerrada!");
        } catch (Exception e) {
            System.out.println("Fallo de conexión");
        }
    }

    /**
     * 
     * @return the connection object
     */
    public Connection getConexion() {
        return this.con;
    }

    /**
     * Change/apply the connection to conect to a database
     * @param con 
     */
    public void setConexion(Connection con) {
        this.con = con;
    }

    /**
     * Get the url of connection
     * @return url where its the database
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the url to connect database
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get the user
     * @return user who try to connect to the database
     */
    public String getUser() {
        return user;
    }

    /**
     * Set the user to connect at database
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
