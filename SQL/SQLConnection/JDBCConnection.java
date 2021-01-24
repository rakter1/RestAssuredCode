package SQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class JDBCConnection {
	
	
	
	void SqlConnect() throws SQLException  {
		
		Connection connect =DriverManager.getConnection("", "", ""); //Dm-API
		Statement state=connect.createStatement();
		ResultSet resultset = state.executeQuery("select* from table name");
		resultset.next();
	
		String s1= resultset.getString("City");
		s1.contains("Berlin");{ //====1
		System.out.println("I am here");
		}
		/*
		 * Assert.assertEquals(s1, "Berlin");{ //==============2} //Compare with Expected and Acutal then use Assert
		 * System.out.println("I am here");
		 * 
		 * } int i =resultset.getInt("Postalode");
		 * 
		 * Assert.assertEquals(i, "1098");{ System.out.println(""); }
		 */
	
	
		}

		
		
	}
	


