package es.dba.ocpJava17.imp.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersJdbc extends ConexionBaseDeDatosH2{
	
    
	public UsersJdbc() {

	}
	
	public  String ejecutarConsulta() {
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Connection conexion = obtenerConexion();
			stmt = conexion.createStatement();
			String sqlConsultaUsuarios = "SELECT * FROM USERS";
			
			rs = stmt.executeQuery(sqlConsultaUsuarios);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String nombre = rs.getString("FIRST_NAME");
				String email = rs.getString("EMAIL");
				
				System.out.println("ID " + id + " Nombre "+ nombre + " email "+ email);
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rs!= null ) rs.close();
				if(stmt != null ) stmt.close();
				
				System.out.println("Cierre de Conexiones");
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
		}
		return "todo correcto";
		
	}
	
}
