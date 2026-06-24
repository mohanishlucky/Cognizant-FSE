-- Update Employee Bonus

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_DepartmentID IN NUMBER,
    p_BonusPercent IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE DepartmentID = p_DepartmentID;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Bonus updated successfully.');
END;
/

-- Execute Procedure

-- Example: Add 10% bonus to Department 101
BEGIN
    UpdateEmployeeBonus(101, 10);
END;
/

-- Explanation
-- Accepts Department ID and Bonus Percentage as parameters.
-- Updates salaries of employees in that department.
-- Adds the specified bonus percentage to each salary.