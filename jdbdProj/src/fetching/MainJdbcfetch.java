package fetching;

import java.sql.*;

import connect.connection;

public class MainJdbcfetch {

	public static void main(String[] args) throws Exception {
		// Step 2: Making connection using Connection type and inbuilt function on
        Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;
 
        con = connection.connectDB();
 
        // Try block to catch exception/s
        try {
 
            // SQL command data stored in String datatype
            String sql = "select * from emp";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
 
            // Printing ID, name, from Adarsh database of the SQL command above
            System.out.println("id\t empName");
 
            // Condition check
            while (rs.next()) {
 
                int id = rs.getInt("empId");
                String name = rs.getString("empName");
                System.out.println(id + "\t\t" + name  + "\t\t");
            }
        }
 
        // Catch block to handle exception
        catch (SQLException e) {
 
            // Print exception pop-up on screen
            System.out.println(e);
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
