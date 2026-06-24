-- Send Loan Due Reminders

DECLARE
BEGIN
    FOR loan_rec IN (
        SELECT LoanID,
               CustomerID,
               DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE
                          AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID ' || loan_rec.LoanID ||
            ' for Customer ID ' || loan_rec.CustomerID ||
            ' is due on ' || loan_rec.DueDate
        );
    END LOOP;
END;
/