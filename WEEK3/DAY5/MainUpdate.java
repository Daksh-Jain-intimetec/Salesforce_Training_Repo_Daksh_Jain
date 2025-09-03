package WEEK3.DAY5;

import java.sql.*;

public class MainUpdate {
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
            String query = String.format("UPDATE Customers SET last_name = '%s' WHERE customer_id = 3","Gulyawar");
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Data Updated Successfully...");
            }else{
                System.out.println("Data Not Updated....");
            }
            statement.close();
            connection.close();

        } catch (SQLException e){
            System.out.println(e);
        }
    }
}

