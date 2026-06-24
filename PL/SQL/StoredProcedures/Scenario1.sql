-- Process Monthly Interest for Savings Accounts
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied successfully.');
END;
/

-- Execute Procedure
BEGIN
    ProcessMonthlyInterest;
END;
/

-- Explanation
-- Selects all Savings accounts.
-- Applies 1% interest to the current balance.
-- Updates the balance and commits the changes.