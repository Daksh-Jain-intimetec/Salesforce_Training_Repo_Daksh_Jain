CREATE TABLE Payment (
    PaymentID INT PRIMARY KEY AUTO_INCREMENT,
    SubscriptionID INT NOT NULL,
    CustomerID INT NOT NULL,
    Amount DECIMAL(10,2) NOT NULL,
    PaymentDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PaymentMethod ENUM('Cash','Card','UPI','NetBanking') NOT NULL,
    Status ENUM('Pending','Successful','Failed','Refunded') DEFAULT 'Pending',
    TransactionReference VARCHAR(100),

    FOREIGN KEY (SubscriptionID) REFERENCES CustomerPlan(SubscriptionID) ON DELETE CASCADE,
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID) ON DELETE CASCADE
);
