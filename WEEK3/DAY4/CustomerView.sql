CREATE VIEW CustomerFullDetails AS
SELECT 
    c.CustomerID,
    CONCAT(c.FirstName, ' ', c.LastName) AS FullName,
    c.Email,
    c.PhoneNumber,
    c.DateOfBirth,
    c.JoinDate,

    a.AddressType,
    a.Street,
    a.City,
    a.State,
    a.ZipCode,
    a.Country,

    p.PlanName,
    p.SpeedMbps,
    p.DataLimitGB,
    p.Price AS PlanPrice,
    p.ValidityDays,

    cp.SubscriptionID,
    cp.StartDate AS SubscriptionStart,
    cp.EndDate AS SubscriptionEnd,
    cp.Status AS SubscriptionStatus,

    pay.PaymentID,
    pay.Amount AS PaymentAmount,
    pay.PaymentDate,
    pay.PaymentMethod,
    pay.Status AS PaymentStatus,
    pay.TransactionReference

FROM Customer c
LEFT JOIN Address a 
       ON c.CustomerID = a.CustomerID
LEFT JOIN CustomerPlan cp 
       ON c.CustomerID = cp.CustomerID
LEFT JOIN Plan p 
       ON cp.PlanID = p.PlanID
LEFT JOIN Payment pay 
       ON cp.SubscriptionID = pay.SubscriptionID;
