package fetching;

import java.sql.*;

public class JdbcConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/adarsh";
			String user = "root";
			String password = "123456";
			
			conn = DriverManager.getConnection(url, user, password);
			if(conn != null) System.out.println("Connected to Database:");
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(conn != null) conn.close();
			} catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

}

//1	Import the package 
//2	Load and Register the drivers 
//3	Establish the connection 
//4	Create the statement 
//5	Execute the statement 
//6	Process Result
//7	Close/terminate
