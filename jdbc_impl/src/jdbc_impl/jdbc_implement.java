package jdbc_impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_implement {

	public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            // 1. Establish the connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 2. Create a SQL statement
            String sql = "SELECT * FROM your_table_name";
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


