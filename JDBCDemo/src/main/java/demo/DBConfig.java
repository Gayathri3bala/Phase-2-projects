package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConfig {
	public static Connection getConnect(Properties props) {
		Connection connection=null;
		try {
			//Get url,username,password from object
			String driver=props.getProperty("driver");
			String url=props.getProperty("url");
			String username=props.getProperty("username");
			String password=props.getProperty("password");
			//load driver
			Class.forName(driver);
			connection=DriverManager.getConnection(url,username,password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
