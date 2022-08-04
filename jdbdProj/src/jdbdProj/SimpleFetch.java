package jdbdProj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SimpleFetch {

	public static void main(String[] args) throws Exception {
		String getList = "Select * from emp";
		//Connection con = connection.connectDB();
		try(Connection con = JdbcUtil.getConnection() ){
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(getList);
			//loop through result set
			while(rs.next()) {
				System.out.println(rs.getString("empName") +"  --->  "+ rs.getInt("empId") );
			}
		} catch(SQLException ex){
			System.out.println(ex.getMessage());
		}

	}

}
