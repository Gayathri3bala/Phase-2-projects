package cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    private Connection connection;
    
    public DBConfig(String url, String username, String password) throws ClassNotFoundException, SQLException{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
    }
    
    public Connection getConnection(){
            return this.connection;
    }
    
    public void closeConnection() throws SQLException {
            if (this.connection != null)
                    this.connection.close();
    }

}


