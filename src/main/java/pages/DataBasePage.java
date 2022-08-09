package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBasePage {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;

	public String getDataFromDb(String columnName) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlurl = "jdbc:mysql://localhost:3306/feb2022";
			String sqlusername = "root";
			String sqlpassword = "root";
			String sqlQuery = "select * from users";

			connection = DriverManager.getConnection(sqlurl, sqlusername, sqlpassword);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				columnValue= resultSet.getString(columnName);
			}
			return columnValue;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return columnValue;

	}
}
