package Unit05;
// TO add a library right click on project->properties->java build path->Libraries->Module path->Add library or Add external JARs 

//Need of JDBC Connector

import java.sql.*;


public class P18_JDBC_Connection {

	public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
		myConn =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDatabase", "avii" , "root");
		myStmt = myConn.createStatement();
		
		int a = myStmt.executeUpdate("INSERT INTO jdbc_tbl VALUES (7, 'Mysql','Akbar', '2021-02-18')");
		
		myRs = myStmt.executeQuery("select * from jdbc_tbl");
		
		while (myRs.next()) {
			System.out.println(myRs.getString("jdbc_id") + ", " + myRs.getString("title") + ", " 
		              + myRs.getString("author") + ", " + myRs.getString("submission_date"));
		
	    }
		
	}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
		myRs.close();
		myStmt.close();
		myConn.close();
		}
		
	}
		
}
