DECLARE
    n NUMBER := &Enter_Number;
    sum_result NUMBER := 0;
    i NUMBER := 1;
BEGIN
    -- 1. IF-ELSEIF-ELSE for sign check
    IF n > 0 THEN
        DBMS_OUTPUT.PUT_LINE('The number is Positive.');
    ELSIF n < 0 THEN
        DBMS_OUTPUT.PUT_LINE('The number is Negative.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('The number is Zero.');
    END IF;

    -- 2. IF for even/odd
    IF MOD(n, 2) = 0 THEN
        DBMS_OUTPUT.PUT_LINE('It is Even.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('It is Odd.');
    END IF;

    -- 3. CASE for range classification
    CASE 
        WHEN n BETWEEN 1 AND 10 THEN
            DBMS_OUTPUT.PUT_LINE('Range: 1 to 10');
        WHEN n BETWEEN 11 AND 20 THEN
            DBMS_OUTPUT.PUT_LINE('Range: 11 to 20');
        WHEN n BETWEEN 21 AND 50 THEN
            DBMS_OUTPUT.PUT_LINE('Range: 21 to 50');
        WHEN n > 50 THEN
            DBMS_OUTPUT.PUT_LINE('Range: Above 50');
        ELSE
            DBMS_OUTPUT.PUT_LINE('Range: Below 1');
    END CASE;

    -- 4. FOR loop if n <= 20
    IF n > 0 AND n <= 20 THEN
        FOR i IN 1..n LOOP
            sum_result := sum_result + i;
        END LOOP;

    -- 5. WHILE loop if 20 < n <= 50
    ELSIF n > 20 AND n <= 50 THEN
        WHILE i <= n LOOP
            sum_result := sum_result + i;
            i := i + 1;
        END LOOP;

    -- 6. LOOP with EXIT WHEN if n > 50
    ELSIF n > 50 THEN
        LOOP
            EXIT WHEN i > n;
            sum_result := sum_result + i;
            i := i + 1;
        END LOOP;
    END IF;

    -- Final output
    DBMS_OUTPUT.PUT_LINE('Sum of numbers from 1 to ' || n || ' is: ' || sum_result);
END;
/
