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
	            // 1. Establish the connection
	            Connection connection = DriverManager.getConnection(jdbcUrl);

	            // 2. Create a SQL statement
	            String sql = "SELECT * FROM Employee";
	            PreparedStatement statement = connection.prepareStatement(sql);

	            // 3. Execute the query
	            ResultSet resultSet = statement.executeQuery();

	            // 4. Process the result
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                // Retrieve other columns as needed
	                System.out.println("ID: " + id + ", Name: " + name);
	            }

	            // 5. Clean up resources
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
    }
}


