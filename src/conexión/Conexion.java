package conexión;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;

public class Conexion {

    private Connection con = null;
    private String url = null;
    private String user = null;
    private String pass = null;

    public Conexion() {

        try {

            this.url = "jdbc:mysql://localhost/sgbd";
            this.user = "root";
            this.pass = "reliquias";

            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("Fallo de conexión");
        }
    }

    public void desconectar() {
        try {
            this.con.close();
            System.out.println("Conexión cerrada!");
        } catch (Exception e) {
            System.out.println("Fallo de conexión");
        }
    }

    public Connection getConexion() {
        return this.con;
    }

    public void setConexion(Connection con) {
        this.con = con;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

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
