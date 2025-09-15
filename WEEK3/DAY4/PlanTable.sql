CREATE TABLE Plan (
    PlanID INT PRIMARY KEY AUTO_INCREMENT,
    PlanName VARCHAR(50) NOT NULL,
    SpeedMbps INT NOT NULL,
    DataLimitGB INT,  -- NULL for unlimited
    Price DECIMAL(10,2) NOT NULL,
    ValidityDays INT NOT NULL
);
