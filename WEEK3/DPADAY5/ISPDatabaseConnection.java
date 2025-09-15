package WEEK3.DPADAY5;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ISPDatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/ISPdb";
    private static String user = null;
    private static String pass = null;


    public static String getCustomerdetail(Statement stm) throws SQLException{
        String query = "SELECT * FROM CustomerFullDetails;";
        ResultSet rs = stm.executeQuery(query);

        while(rs.next()){
            int id = rs.getInt("CustomerID");
            String name = rs.getString("FullName");
            String email = rs.getString("Email");
            String phone = rs.getString("PhoneNumber");
            String plan = rs.getString("PlanName");
            String paymentStatus = rs.getString("PaymentStatus");

            System.out.println(
                "ID: " + id +
                ", Name: " + name +
                ", Email: " + email +
                ", Phone: " + phone +
                ", Plan: " + plan +
                ", Payment: " + paymentStatus
            );
        }
        rs.close();
        return "Customer deatils fetched Successfully";
    }

    public static String addCustomer(Connection con,String fName, String lName, String email, String phone) throws SQLException{
        String insertQuery = "INSERT INTO Customer (FirstName, LastName, Email, PhoneNumber) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertQuery);

        pstmt.setString(1, fName);
        pstmt.setString(2, lName);
        pstmt.setString(3, email);
        pstmt.setString(4, phone);

        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            return "New customer added successfully using PreparedStatement!";
        }
        return "Unsuccessfull..";
    }

    public static String addPlan(Statement stm, String planName, int speed, int dataLimit, double price, int days ) throws SQLException{
        String planQuery = "INSERT INTO Plan (PlanName, SpeedMbps, DataLimitGB, Price, ValidityDays) " +
                            "VALUES ('" + planName + "', " + speed + ", " +
                            (dataLimit == 0 ? "NULL" : dataLimit) + ", " +
                            price + ", " + days + ")";
        int result = stm.executeUpdate(planQuery);
        if(result>0){
            return "Plan added successfully!";
        }else{
            return "Unsuccesfull..";
        }
        
    }

    public static String planToCustomer(Statement stm, int custId, int planId) throws SQLException{
        
        String assignQuery = "INSERT INTO CustomerPlan (CustomerID, PlanID, StartDate) VALUES (" +
                                custId + "," + planId + ", CURDATE())";
        int result = stm.executeUpdate(assignQuery);
        if(result>0){
            return "Plan assigned to customer!";
        }else{
            return "Unsuccesfull..";
        }
        
    }

    public static String deleteCustomer(Statement stm, int deleteId) throws SQLException{
        
        String deleteQuery = "DELETE FROM Customer WHERE CustomerID=" + deleteId;
        int result = stm.executeUpdate(deleteQuery);
        if(result>0){
            return "Customer deleted successfully!";
        }else{
            return "Unsuccesfull..";
        }
    }

    public static void main(String[] args) {
        boolean system = true;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            System.out.println(e);
        }
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        Statement stm = null;
        try{
            System.out.println("Enter user: ");
            String user = sc.next();
            System.out.println("Enter password: ");
            String pass = sc.next();
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
        }catch (SQLException e){
            System.out.println(e);
            system = false;
        }

        int choice = 0;
        while(system == true){
            System.out.println("ISP Database System.....");
            System.out.println("1. Customer Detail");
            System.out.println("2. Add New Customer");
            System.out.println("3. Add New Plan");
            System.out.println("4. Add New Plan to Customer");
            System.out.println("5. Delete Customer Detail");
            System.out.println("6. Exit ISP Database System.....");

            try{
                choice= sc.nextInt();
                
            }catch(InputMismatchException e){
                System.out.println(e + " : Only Integer Value is Allowed...");
                System.out.println("*******************************************************************");
                sc.nextLine();
            }
            

            try{
                switch (choice) {
                    case 1: // Show Customer Details
                            System.out.println(getCustomerdetail(stm));
                        break;  
                        
                    case 2: // Add new customer
                            System.out.print("Enter First Name: ");
                            String fName = sc.next();
                            System.out.print("Enter Last Name: ");
                            String lName = sc.next();
                            System.out.print("Enter Email: ");
                            String email = sc.next();
                            System.out.print("Enter Phone: ");
                            String phone = sc.next();
                            System.out.println(addCustomer(con, fName, lName, email, phone));
                        break;

                    case 3: // Add new plan
                            System.out.print("Enter Plan Name: ");
                            String planName = sc.nextLine();
                            System.out.print("Enter Speed (Mbps): ");
                            int speed = sc.nextInt();
                            System.out.print("Enter Data Limit (GB, or 0 for unlimited): ");
                            int dataLimit = sc.nextInt();
                            System.out.print("Enter Price: ");
                            double price = sc.nextDouble();
                            System.out.print("Enter Validity Days: ");
                            int days = sc.nextInt();
                            sc.nextLine();
                            System.out.println(addPlan(stm, planName, speed, dataLimit, price, days));
                        break;

                    case 4: // Assign plan to customer
                            System.out.print("Enter Customer ID: ");
                            int custId = sc.nextInt();
                            System.out.print("Enter Plan ID: ");
                            int planId = sc.nextInt();
                            sc.nextLine();
                            System.out.println(planToCustomer(stm, custId, planId));
                        break;

                    case 5: // Delete customer
                            System.out.print("Enter Customer ID to delete: ");
                            int deleteId = sc.nextInt();
                            sc.nextLine();
                            System.out.println(deleteCustomer(stm, deleteId));
                        break;

                    case 6:
                        System.out.print("Closing ISP Database System.....");
                        stm.close();
                        con.close();
                        system = false;
                        break;

                    default:
                        System.out.println("Invalid Choice. Try Again.");
                        System.out.println("*******************************************************************");
                }
            } catch(SQLException e){
                System.out.println(e);
            }
        }
        if(system == false){
            System.out.println("System closed..");
        }
        sc.close();
    }

    public static String getUrl(){
        return url;
    }
    public static String getUser(){
        return user;
    }
    public static String getPass(){
        return pass;
    }

}
