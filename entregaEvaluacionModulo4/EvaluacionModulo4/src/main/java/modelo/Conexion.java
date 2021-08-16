package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
	
	
	  private static Connection con = null;
	  
	  private Conexion(){ 
		  try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
	  "system", "Ashe1010@");
	  
	  } catch (ClassNotFoundException | SQLException e){
		  e.printStackTrace(); } }
	  
	  public static Connection getInstance(){ //singleton
		  if (con == null){ 
			  new Conexion(); 
			  } 
		  return con; 
		  }

	 
}
