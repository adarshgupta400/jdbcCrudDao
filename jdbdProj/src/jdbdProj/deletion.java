package jdbdProj;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connect.connection;

public class deletion {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String delete = "DELETE from emp WHERE empId=11 ; ";
		try(Connection conn= connection.connectDB()){
			Statement st = conn.createStatement();
			st.executeUpdate(delete);
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
