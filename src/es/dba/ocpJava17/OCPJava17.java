package es.dba.ocpJava17;

import es.dba.ocpJava17.basicos.JavaBasics;
import es.dba.ocpJava17.imp.jdbc.UsersJdbc;

public class OCPJava17 {

	public static void main(String[] args) {
		System.out.println("Clase principal");
        llamadaClaseA();
        consultaUsuarios();
	}
	
	private static void llamadaClaseA() {
		JavaBasics javaBasics = new JavaBasics();
		javaBasics.datosPrimitvos();
	}
	
	private static void consultaUsuarios() {
		UsersJdbc userJdbc = new UsersJdbc();
		userJdbc.ejecutarConsulta();
	}

}
