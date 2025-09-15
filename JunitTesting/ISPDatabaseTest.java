import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import WEEK3.DPADAY5.ISPDatabaseConnection;

public class ISPDatabaseTest {
    static Connection con = null;
    static Statement stm = null;

    @BeforeAll
public static void beforeAll() throws SQLException, ClassNotFoundException {
    System.out.println("Setting up H2 in-memory database...");

    // Load H2 Driver
    Class.forName("org.h2.Driver");

    // Connect to in-memory DB (fresh every run)        
    con = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");
    stm = con.createStatement();    

    // Create tables
    stm.execute("CREATE TABLE Customer (" +
            "CustomerID INT AUTO_INCREMENT PRIMARY KEY, " +
            "FirstName VARCHAR(50), LastName VARCHAR(50), " +
            "Email VARCHAR(100), PhoneNumber VARCHAR(20), " +
            "DateOfBirth DATE, JoinDate DATE)");

    stm.execute("CREATE TABLE Plan (" +
            "PlanID INT AUTO_INCREMENT PRIMARY KEY, " +
            "PlanName VARCHAR(100), SpeedMbps INT, DataLimitGB INT, " +
            "Price DECIMAL(10,2), ValidityDays INT)");

    stm.execute("CREATE TABLE CustomerPlan (" +
            "SubscriptionID INT AUTO_INCREMENT PRIMARY KEY, " + // ✅ Added SubscriptionID
            "CustomerID INT NOT NULL, " +
            "PlanID INT NOT NULL, " +
            "StartDate DATE DEFAULT CURRENT_DATE, " +
            "EndDate DATE, " +
            "Status VARCHAR(20) DEFAULT 'Active' CHECK (Status IN ('Active','Expired','Cancelled')), " +
            "FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID), " +
            "FOREIGN KEY (PlanID) REFERENCES Plan(PlanID))");

    stm.execute("CREATE TABLE Address (" +
            "AddressID INT AUTO_INCREMENT PRIMARY KEY, " +
            "CustomerID INT, " +
            "AddressType VARCHAR(20) DEFAULT 'Installation', " + // ENUM replaced with VARCHAR
            "Street VARCHAR(100), City VARCHAR(50), State VARCHAR(50), " +
            "ZipCode VARCHAR(10), Country VARCHAR(50) DEFAULT 'India', " +
            "FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID))");

    stm.execute("CREATE TABLE Payment (" +
            "PaymentID INT AUTO_INCREMENT PRIMARY KEY, " +
            "SubscriptionID INT NOT NULL, " +
            "CustomerID INT NOT NULL, " +
            "Amount DECIMAL(10,2) NOT NULL, " +
            "PaymentDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
            "PaymentMethod VARCHAR(20) NOT NULL CHECK (PaymentMethod IN ('Cash','Card','UPI','NetBanking')), " +
            "Status VARCHAR(20) DEFAULT 'Pending' CHECK (Status IN ('Pending','Successful','Failed','Refunded')), " +
            "TransactionReference VARCHAR(100), " +
            "FOREIGN KEY (SubscriptionID) REFERENCES CustomerPlan(SubscriptionID), " +
            "FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID))");

    // Create view
    stm.execute("CREATE VIEW CustomerFullDetails AS " +
        "SELECT c.CustomerID, CONCAT(c.FirstName, ' ', c.LastName) AS FullName, " +
        "c.Email, c.PhoneNumber, c.DateOfBirth, c.JoinDate, " +
        "a.AddressType, a.Street, a.City, a.State, a.ZipCode, a.Country, " +
        "p.PlanName, p.SpeedMbps, p.DataLimitGB, p.Price AS PlanPrice, p.ValidityDays, " +
        "cp.SubscriptionID, cp.StartDate AS SubscriptionStart, cp.EndDate AS SubscriptionEnd, cp.Status AS SubscriptionStatus, " +
        "pay.PaymentID, pay.Amount AS PaymentAmount, pay.PaymentDate, pay.PaymentMethod, pay.Status AS PaymentStatus, pay.TransactionReference " +
        "FROM Customer c " +
        "LEFT JOIN Address a ON c.CustomerID = a.CustomerID " +
        "LEFT JOIN CustomerPlan cp ON c.CustomerID = cp.CustomerID " +
        "LEFT JOIN Plan p ON cp.PlanID = p.PlanID " +
        "LEFT JOIN Payment pay ON cp.SubscriptionID = pay.SubscriptionID");

    System.out.println("H2 Database Ready for Tests");
    
}

    @AfterAll
    public static void afterAll() throws SQLException {
        if (stm != null) stm.close();
        if (con != null) con.close();
        System.out.println("All Test_cases Run Successfully.....");
        
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Starting New UnitTest.....");
        
    }

    @AfterEach
    public void afterEach() {
        System.out.println("UnitTest Ended Here.....");
        
    }

    @Test
    public void getCustomerdetailTest() throws SQLException {
        String actual = ISPDatabaseConnection.getCustomerdetail(stm);
        String expected = "Customer deatils fetched Successfully";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addCustomerTest() throws SQLException {
        
        String actual = ISPDatabaseConnection.addCustomer(con, null, null, null, null);
        String expected = "New customer added successfully using PreparedStatement!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addPlanTest() throws SQLException {
        String actual = ISPDatabaseConnection.addPlan(stm, null, 0, 0, 0, 0);
        String expected = "Plan added successfully!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void planToCustomerTest() throws SQLException {
        String actual = ISPDatabaseConnection.planToCustomer(stm, 0, 0);
        String expected = "Plan assigned to customer!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteCustomerTest() throws SQLException {
        String actual = ISPDatabaseConnection.deleteCustomer(stm, 0);
        String expected = "Customer deleted successfully!";
        Assertions.assertEquals(expected, actual);
    }
}
