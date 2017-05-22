package jdbc_learning;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtility {
	

	//public static Connection main(String[] args) throws Exception {
public static Connection getConnection() throws Exception{
	      
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("D:\\properties");
		props.load(fis);	
		//Connection con = null;

		final String classForName = props.getProperty("classForName");
		final String driverManager = props.getProperty("driverManager");
		final String user_id = props.getProperty("user_id");
		final String password = props.getProperty("password");


		Class.forName(classForName);
		Connection con = DriverManager.getConnection(driverManager, user_id, password);
     
       return con;
 }


}
