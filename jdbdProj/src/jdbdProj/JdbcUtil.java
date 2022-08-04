package jdbdProj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
	public static Connection getConnection() throws SQLException {
		Properties properties = new Properties();
		Connection conn = null;
			
		try (InputStream isStream = new FileInputStream("resources/dbConfig.properties")) {
			properties.load(isStream);

			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");

			conn = DriverManager.getConnection(url, user, password);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

}
