drop  table employees;
CREATE TABLE employees (
    emp_id     NUMBER PRIMARY KEY,
    emp_name   VARCHAR2(100),
    salary     NUMBER(10,2)
);
INSERT INTO employees VALUES (101, 'Alice', 50000);
INSERT INTO employees VALUES (102, 'Bob', 60000);
INSERT INTO employees VALUES (103, 'Charlie', 55000);
CREATE OR REPLACE PROCEDURE update_salary (
    p_emp_id     IN employees.emp_id%TYPE,
    p_increment  IN employees.salary%TYPE
)
IS
    v_count NUMBER;
BEGIN
    SELECT COUNT(*) INTO v_count
    FROM employees
    WHERE emp_id = p_emp_id;

    IF v_count = 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Employee not found.');
    END IF;

    UPDATE employees
    SET salary = salary + p_increment
    WHERE emp_id = p_emp_id;

    DBMS_OUTPUT.PUT_LINE('Salary updated successfully.');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
BEGIN
    update_salary(102, 5000);
END;
SELECT * FROM employees;
