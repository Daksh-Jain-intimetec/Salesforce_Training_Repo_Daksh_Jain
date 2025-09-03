package WEEK3.DAY5;

import java.sql.*;

public class MainInsert {
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
            String query = String.format("INSERT INTO Customers(first_name,number) VALUES ('%s',%o)","Aman",123455789);
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println(rowsAffected);
                System.out.println("Data Inserted Successfully...");
            }else{
                System.out.println("Data Not Inserted....");
            }
            statement.close();
            connection.close();

        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
