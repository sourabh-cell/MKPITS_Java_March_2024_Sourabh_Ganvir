#Assignment 16 trigger 


#. **Prevent Deletion of Active Customers**:
#- **Problem Statement**: Prevent the deletion of a customer who has any active rentals.
#- **Trigger Description**: Create a `BEFORE DELETE` trigger on the `customer` table that checks for active rentals.If active rentals exist, raise an error and prevent the deletion.

DELIMITER //

CREATE TRIGGER BEFORE_customer_delete
BEFORE DELETE ON customer
FOR EACH ROW
BEGIN
    DECLARE active_rentals INT;

    SELECT COUNT(*)
    INTO active_rentals
    FROM Rental r
    JOIN Inventory i ON r.Inventory_ID = i.Inventory_ID
    JOIN Film f ON i.Film_ID = f.Film_ID
    WHERE r.Customer_ID = OLD.Customer_ID AND r.ReturnDate IS NULL;

    
    IF active_rentals > 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Cannot delete customer with active rentals.';
    END IF;
END //

DELIMITER ;

#2. **Update Last Updated Timestamp**:
#  - **Problem Statement**: Automatically update the `last_update` timestamp column in the `film` table whenever a film's details are modified.
#   - **Trigger Description**: Create a `BEFORE UPDATE` trigger on the `film` table that sets the `last_update` column to the current timestamp.

DELIMITER //

CREATE TRIGGER BEFORE_FILM_UPDATE
BEFORE UPDATE ON FILM
FOR EACH ROW
BEGIN
    SET NEW.LAST_UPDATE=current_timestamp();
    
END //

DELIMITER ;



#3. **Log Film Deletion**:
#   - **Problem Statement**: Log details of any film deletions into a `deleted_films_log` table for auditing purposes.
#   - **Trigger Description**: Create an `AFTER DELETE` trigger on the `film` table that inserts the deleted film's details into the `deleted_films_log` table.

DELIMITER //

CREATE TRIGGER AFTER_FILM_DELETE
AFTER DELETE ON FILM
FOR EACH ROW
BEGIN
    INSERT INTO DELETE_FILE_LOG (FILM_ID,TITLE) VALUES (OLD.FILM_ID,OLD.TITLE);
    
END //

DELIMITER ;

DELETE FROM FILM WHERE FILM_ID=4;

#4. **Ensure Valid Rental Dates**:
#   - **Problem Statement**: Ensure that the `return_date` in the `rental` table is always after the `rental_date`.
#   - **Trigger Description**: Create a `BEFORE INSERT` or `BEFORE UPDATE` trigger on the `rental` table that checks if the `return_date` is after the `rental_date`. If not, raise an error to prevent the insert or update.

DELIMITER //
CREATE TRIGGER BEFORE_RENTAL_INSERT
BEFORE INSERT ON RENTAL
FOR EACH ROW
BEGIN
    IF (NEW.RENTAL_DATE>NEW.RETURN_DATE)
    THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'RETURN DATE IS EARLIER THAN RENTAL_DATE ';
    END IF;
END //
DELIMITER ;

INSERT INTO `sakila`.`RENTAL` (`rental_id`, `rental_date`, `inventory_id`, `customer_id`, `return_date`, `staff_id`, `last_update`) VALUES ('1002', '2005-05-31 00:46:30', '1774', '83', '2005-05-31 00:40:30', '2', '2006-02-15 21:30:53');