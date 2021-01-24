package SQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

		/*1)	Create a connection  
		2)	Create statement /Query
		3)	Execute statement /Query
		4)	Store the results in  result set
		5)	Close connection and 
		6)	After completion of this, if you want to write simple confirmation message - syso
		 */
public class DataBase_Con_Select_Command {


	@Test
	public void DataBaseSelectCommand() throws SQLException {

		// 1) Create a connection to the Database // here 'hr' = database . we will retrieve the data from hr database
		Connection connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","mysql123");

		//2 )Create statement /Query-	
		Statement statement=connect.createStatement(); 
		
		//These query will return the data and I execute it, it will give RequiredSet or ResultSet
		String s = "select * from Customer"; // all data or 
		String s1 = "select column1, column 2  from Customer"; //Specific column or 
		String s2 = "select employee_id,first_name, last_name from Customer"; // Capturing three different column
		
		// to store the data we need to use a special class called as ResultSet
		// 3) 	Execute statement /Queryand and 4)Store the results in  result set 
		ResultSet resultset =statement.executeQuery("s");// =================1) First Query) 
		resultset.next();
		
		// here 2 diff columns and n number of Rows.So I want to get all the columns and all the  rows.
		//that i will use loop statement 
		ResultSet rs1 =statement.executeQuery("s1"); // =================2) 2nd Query) 
		while(rs1.next()) {
			rs1.getString("ColumnName1");
			rs1.getString("ColumnName2");
			
			
		}					// if it returns true 
		
		ResultSet rs2 =statement.executeQuery("s2");//=================1) 3rd Query) 
		
		// This particular loop will be repeat multiple time till the last info and this rs contains data .
		while(rs2.next()) {
			int eid= rs1.getInt("EmployeeID");
			String firstname= rs1.getString("First_Name");
			String lastName =rs1.getString("Last_Name");
			
			System.out.println(eid+"  "+firstname+"  "+lastName); // print as a singly 
				}
		
		//4) Close connection {So connection name is 'connect'}

		connect.close();
		System.out.println("Query Executed ----");


	}
	
	
}


// In this loop we are reading the from this "rs"/ resultset/ rs1/ rs2. and printing the data into the console.s 