/**
 * 
 */
/**
 * 
 */
module OCPJava17 {
	requires java.sql; //  Necesario para utilizar JDBC
	//requires com.h2database; // no se puede poner la instrucción requires h2 directamente porque el jar de h2 no contiene un module-info. 
	                         // debido a este motivo se utiliza un módulo automatico. Java genera un nombre automatico basado en el jar. 
}