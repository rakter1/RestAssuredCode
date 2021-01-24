package SQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MysqlCon_Insert_Update_Delete {

	/*
	 * 1) Create a connection
	 * 2) Create statement /Query 
	 * 3) Execute statement /Query
	 * 4) Close connection
	 *///===================================================
	@Test
	public void DataBaseConnection () throws SQLException {
		
		// 1) Create a connection to the Database
		Connection connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","mysql123");

		//Create statement /Query- which we need to  execute against the data base 
		// create a  statement() method  with the connection which we have "connect"

		//2 )Create statement /Query-	
		Statement state=connect.createStatement(); 
		// Insert Query
		//String s= "INSERT INTO STUDENT VALUES(103,'RUMA')";
		
		//Update the query 
		//String s= "UPDATE STUDENT SET RUMA= 'AFSHEEN' WHERE SID=102";
		
		//Delete Query 
			String s= "DELETE FROM STUDENT WHERE SID=102";
				
		
		// 3) Execute statement /Query
		state.execute(s);
		
		//4) Close connection {So connection name is 'connect'}
		
		 connect.close();
		 System.out.println("Query Executed ----");
		 
		 
	}
	
}
