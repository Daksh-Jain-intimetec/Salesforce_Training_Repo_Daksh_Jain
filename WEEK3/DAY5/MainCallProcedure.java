package WEEK3.DAY5;

import java.sql.*;

public class MainCallProcedure {
   private static final String url = "jdbc:mysql://localhost:3306/ISPdb";
   private static final String username = "root";
   private static final String password = "tiger";
    public static void main(String[] args) {
        // try{
        //     Class.forName("com.mysql.cj.jdbc.Driver");
        // } catch (ClassNotFoundException e){
        //     System.out.println(e);
        // }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            CallableStatement statement = connection.prepareCall("{call getCustomerById(?)}");
            statement.setInt(1, 3);   // set input parameter
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
            }
            statement.close();
            connection.close();

        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
