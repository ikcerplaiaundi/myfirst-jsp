package modelo;

import java.sql.*;
import java.util.Properties;

public class Conexion {
	protected Connection cn;
	protected String username ="AP_ADMIN";
	protected String userpassword="123";
	public Conexion() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getCn() {
		return cn;
	}

	public void setCn(Connection cn) {
		this.cn = cn;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public void abrirConexion() {
		System.out.println("1abrir conexion");
		try {
			
			//String url = "jdbc:mysql:///FabricaMuebles";
			            //"jdbc:oracle:thin:@<ip_de_la_maquina_host>:49161:xe";
			 String url = "jdbc:oracle:thin:@192.168.100.152:49161:xe";       
             Properties props = new Properties();
             props.setProperty("user", username);
             props.setProperty("password", userpassword);
             cn = DriverManager.getConnection(url,props);
             
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("2abrir conexion");
	}
	
	public void cerrarConexion() {
		System.out.println("1cerar conexion");
		try {
			
			cn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("2cerar conexion");
	}
	
}

