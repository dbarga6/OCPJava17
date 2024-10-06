package es.dba.ocpJava17;

import es.dba.ocpJava17.basicos.JavaBasics;

public class OCPJava17 {

	public static void main(String[] args) {
		System.out.println("Clase principal");
        llamadaClaseA();
	}
	
	private static void llamadaClaseA() {
		JavaBasics javaBasics = new JavaBasics();
		javaBasics.datosPrimitvos();
	}

}
