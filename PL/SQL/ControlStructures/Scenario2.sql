
-- Promote Customers to VIP Status
DECLARE
BEGIN
    FOR cust IN (
        SELECT CustomerID, Balance
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'Customer ' || cust.CustomerID ||
            ' promoted to VIP status.'
        );
    END LOOP;

    COMMIT;
END;
/