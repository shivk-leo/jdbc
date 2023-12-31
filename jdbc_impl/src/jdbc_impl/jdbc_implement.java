package jdbc_impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_implement {

	public static void main(String[] args) {
		 String jdbcUrl = "jdbc:sqlite:C:\\Users\\sivakiran\\MySQLiteDB";

	        try {
	            Connection connection = DriverManager.getConnection(jdbcUrl);
	            String sql = "SELECT * FROM Employee";
	            PreparedStatement statement = connection.prepareStatement(sql);
	            ResultSet resultSet = statement.executeQuery();
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                System.out.println("ID: " + id + ", Name: " + name);
	            }
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
    }
}


