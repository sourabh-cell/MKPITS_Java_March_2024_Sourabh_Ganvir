# assign 15 function
#1. **Calculate Late Fees for a Rental**:
#   Write a function that accepts a rental ID and calculates the total DAYS FOR rental. The function should return the TOTAL DAYS.

DELIMITER //
CREATE FUNCTION NO_OF_RENTAL_DAYS(RENTALID INT) 
RETURNS int 
DETERMINISTIC
BEGIN
 DECLARE DAYS INT;
  SELECT DATEDIFF(RETURN_DATE,RENTAL_DATE) FROM RENTAL WHERE RENTAL_ID=RENTALID INTO DAYS ; 
  RETURN DAYS;
END //
DELIMITER ;

# EXECUTE FUNCTION
SELECT NO_OF_RENTAL_DAYS(1);


#2. **Get Film Rating by Title**:
#  Create a function that takes a film title as input and returns the film's rating. The function should search for the film by title and return its rating (e.g., G, PG, PG-13, R, NC-17).


DELIMITER //
CREATE FUNCTION FILM_RATING (FILMTITLE CHAR(20)) 
RETURNS CHAR 
DETERMINISTIC
BEGIN
 DECLARE RATING CHAR(20);
  SELECT RATING FROM FILM WHERE TITLE=FILMTITLE INTO RATING; 
  RETURN RATING;
END //
	DELIMITER ;

SELECT FILM_RATING('ACADEMY DINOSAUR')


#3. **Count Films by Language**:
#Develop a function that accepts a language name and returns the number of films available in that language. The function should query the films and languages tables to provide the count.

DELIMITER //
CREATE FUNCTION FILM_ACCORDING_LANGUAGE (FILMLANG CHAR(20)) 
RETURNS INT 
DETERMINISTIC
BEGIN
DECLARE COUNTFILM INT;


  SELECT COUNT(F.FILM_ID) INTO COUNTFILM FROM FILM F 
  JOIN LANGUAGE L ON F.LANGUAGE_ID=L.LANGUAGE_ID
  WHERE L.NAME = FILMLANG;
  
  RETURN COUNTFILM;
  
END //
DELIMITER ;

DROP function FILM_ACCORDING_LANGUAGE;

SELECT FILM_ACCORDING_LANGUAGE('ENGLISH')
