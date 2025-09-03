package WEEK3.DAY5;

import java.sql.*;

public class MainGet2 {
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
            String query = "select * from Customers";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultset = preparedStatement.executeQuery();
            // System.out.println(connection);
            // System.out.println(preparedStatement);
            while(resultset.next()){
                //System.out.println(resultset);
                int id = resultset.getInt("customer_id");
                String first_name = resultset.getString("first_name");
                String last_name = resultset.getString("last_name");
                String address = resultset.getString("address");
                int num = resultset.getInt("number");
                int plan_id = resultset.getInt("plan_id");
                System.out.println("customer_id: "+ id + "\nfirstname: " + first_name +"\nlastname: "+ last_name + "\naddress: "+ address + "\nnumber: " + num + "\nplan_id: " + plan_id);
            }
            resultset.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e){
            System.out.println(e);
        }
    }
}

