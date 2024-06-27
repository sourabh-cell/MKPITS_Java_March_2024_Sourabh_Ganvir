#cursor Practice

DELIMITER $$
CREATE PROCEDURE fetch_actors()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE actor_id INT;
    DECLARE first_name VARCHAR(45);
    DECLARE last_name VARCHAR(45);

    -- Declare a cursor to select actor_id, first_name, and last_name from the actor table
    DECLARE actor_cursor CURSOR FOR
        SELECT actor_id, first_name, last_name
        FROM actor;

    -- Declare a NOT FOUND handler to set done to TRUE
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    -- Open the cursor
    OPEN actor_cursor;

    -- Loop through the rows in the cursor
    read_loop: LOOP
        -- Fetch the next row into variables
        FETCH actor_cursor INTO actor_id, first_name, last_name;

        -- Exit the loop if there are no more rows
        IF done THEN
            LEAVE read_loop;
        END IF;

        -- Do something with the fetched data
        SELECT CONCAT('Actor ID: ', actor_id, ', Name: ', first_name, ' ', last_name) AS actor_info;
    END LOOP;

    -- Close the cursor
    CLOSE actor_cursor;
END$$

DELIMITER ;

---------------------------------------------------------------------------------

USE LORDdATABASE

DELIMITER $$
CREATE PROCEDURE FILL_ROLL()
BEGIN
DECLARE RC INT;
DECLARE i INT DEFAULT 0;
DECLARE ROL INT;

#declaring cursor
DECLARE ROLL_CURSOR CURSOR FOR SELECT ROLL_NO FROM STUDENTDETAILS;


#opening cursor
OPEN ROLL_CURSOR;

#taking count of row in rc 
select count(*) into rc from studentdetails;

 WHILE i<rc DO
       FETCH FROM ROLL_CURSOR INTO ROL;
       INSERT INTO ROLL VALUES(ROL);
       set i=i+1;
         END While;
         
CLOSE ROLL_CURSOR;         
         
END; $$
