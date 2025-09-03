package WEEK3.DAY5;

import java.sql.*;

public class MainDelete {
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
            Statement statement = connection.createStatement();
            String query = String.format("DELETE FROM Customers WHERE customer_id = 2");
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Data Deleted Successfully...");
            }else{
                System.out.println("Data Deleted Updated....");
            }
            statement.close();
            connection.close();

        } catch (SQLException e){
            System.out.println(e);
        }
    }
}

