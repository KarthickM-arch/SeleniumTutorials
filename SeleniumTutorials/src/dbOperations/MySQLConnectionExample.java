package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//Database name
		Class.forName("com.mysql.jdbc.driver");

		//Database connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_users");
		//Username & Password ---> "jdbc:mysql://localhost:8080/selenium_users","root","root");


		//Create a statement
		Statement statement = connection.createStatement();

		//Execute query
		ResultSet result = statement.executeQuery("SELECT * FROM superheros_table");

		while(result.next()) {
			System.out.println(result.getString(1));
		}

	}

}
