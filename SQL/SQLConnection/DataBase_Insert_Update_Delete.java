package SQLConnection;


import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBase_Insert_Update_Delete{


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

			//2 )Create statement /Query-	
			Statement state=connect.createStatement(); 
			String s= "INSERT INTO STUDENT VALUES(103,'RUMA')";

			// 3) Execute statement /Query
			state.execute(s);
			
			//4) Close connection {So connection name is 'connect'}
			
			 connect.close();
			 System.out.println("Query Executed ----");
			 
			 
		}
		
	}



