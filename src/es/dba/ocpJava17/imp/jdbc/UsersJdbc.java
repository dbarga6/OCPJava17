package es.dba.ocpJava17.imp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersJdbc {
	private static final String JDBC_URL = "jdbc:h2:~/hshdb";
    private static final String USER = "sa";
    private static final String PASSWORD = "password";
    
	public UsersJdbc() {

	}
	
	// Método para obtener la conexión
	public static Connection obtenerConexion() throws SQLException{
		// Cargar el driver de H2 (opcional en versiones modernas)
		// Class.forName("org.h2.Driver"); --> Esto solo si fuera necesario
		
		// Establecer la conexción
		Connection conexion = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
		System.out.println("Conexión establecida con la base de datos h2");
		
		
		return conexion;
	}
	
	public static void ejecutarConsulta() {
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conexion = obtenerConexion();
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
				if(conexion!=null) conexion.close();
				System.out.println("Cierre de Conexiones");
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
		}
		
	}
	
}
