package conexión;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion{

	private Connection con = null;
	private String url = null;
	private String user = null;
	private String pass = null;

	Conexion (String url, String user, String pass){
		this.url = url;
		this.user = user;
		this.pass = pass;

		try{
			System.out.println("[\t\t···DATOS DE LA CONEXIÓN···\t]");
			System.out.println(" · Base de datos: " + this.url);
			System.out.println(" · Usuario: " + this.user);
			if(this.pass != null){
				System.out.println(" · Conexión con contraseña");
			}else{
				System.out.println(" · Conexión sin contraseña");
			}
			System.out.println("\nEstableciendo conexión!");
			this.con = (Connection) DriverManager.getConnection(this.url ,this.user, this.pass);
			System.out.println("Conexión por defecto establecida!");
			System.out.println("[\t\t··························\t\t]");

		}catch(Exception e){
			System.out.println("Fallo de conexión");
			System.out.println("[\t\t··························\t\t]");
		}
	}

	public void desconectar(){
		try {
			this.con.close();
			System.out.println("Conexión cerrada!");
		}catch(Exception e){
			System.out.println("Fallo de conexión");
		}
	}

	public Connection getConexion(){
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
