package connect;

//Java Program to Retrieve Contents of a Table Using JDBC
//connection

//Showing linking of created database

//Importing SQL libraries to create database
import java.sql.*;

public class connection {

	static Connection con = null;

	public static Connection connectDB() throws Exception

	{

		try {
			// Importing and registering drivers
			//	Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/adarsh",
				"root", "123456");

			return con;
		}
		catch (SQLException e) {

			System.out.println(e);
		}
		return con;
	}
}
