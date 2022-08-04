package jdbdProj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.connection;

public class InsertionUsingPreparedSt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String insertEmp = "Insert into emp(empId, empName)" + "VAlues(?,?)";
		try(Connection conn =connection.connectDB()){
			PreparedStatement pst = conn.prepareStatement(insertEmp);
			pst.setInt(1, 12); //column + empId
			pst.setString(2," Added by preparedStmt");
			
			pst.executeUpdate();
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
