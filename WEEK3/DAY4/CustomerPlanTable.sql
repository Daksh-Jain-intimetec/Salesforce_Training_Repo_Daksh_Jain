CREATE TABLE CustomerPlan (
    SubscriptionID INT PRIMARY KEY AUTO_INCREMENT,
    CustomerID INT,
    PlanID INT,
    StartDate DATE NOT NULL,
    EndDate DATE,
    Status ENUM('Active','Expired','Suspended') DEFAULT 'Active',
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID) ON DELETE CASCADE,
    FOREIGN KEY (PlanID) REFERENCES Plan(PlanID) ON DELETE CASCADE
);
