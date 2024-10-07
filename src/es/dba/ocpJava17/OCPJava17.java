package es.dba.ocpJava17;

import es.dba.ocpJava17.basicos.JavaBasics;
import es.dba.ocpJava17.imp.jdbc.ConexionBaseDeDatosH2;
import es.dba.ocpJava17.imp.srv.UserSrvImp;

public class OCPJava17 {

	public static void main(String[] args) {
		System.out.println("Clase principal");
        llamadaClaseA();
        consultaUsuarios();
        ConexionBaseDeDatosH2.cerrarConexion();
	}
	
	private static void llamadaClaseA() {
		JavaBasics javaBasics = new JavaBasics();
		javaBasics.datosPrimitvos();
	}
	
	private static void consultaUsuarios() {
		UserSrvImp userSrv = new UserSrvImp();
		userSrv.obtenerUsuario();
	}

}
