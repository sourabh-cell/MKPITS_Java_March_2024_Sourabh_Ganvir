
# TRIGGER PRACTICE


# UPDATE BALANCE WHEN NEW TRANSACTION DONE
DELIMITER //
Create Trigger before_INSERT_TRANSACTION   
BEFORE INSERT ON TRANSACTION FOR EACH ROW  
BEGIN  
IF NEW.TRANSACTION_TYPE='DEPOSITE'
THEN
UPDATE ACCOUNT SET BALANCE=BALANCE+NEW.AMOUNT
WHERE ACCOUNT_NO=NEW.ACCOUNT_NO ;  
ELSE
UPDATE ACCOUNT SET BALANCE=BALANCE-NEW.AMOUNT
WHERE ACCOUNT_NO=NEW.ACCOUNT_NO ; 
END IF;
END; //

DESC TRANSACTION

ALTER TABLE TRANSACTION ADD CONSTRAINT CH_TR CHECK(TRANSACTION_TYPE IN ('DEPOSITE','WITHDRAWL'));

#UPDATE DETAILS OF ACCOUNT HOLDER IN TRANSACTION TABLE WHEN ACCOUNT TABLE UPDATED


USE BANK
SELECT * FROM ACCOUNT
SELECT * FROM TRANSACTION

INSERT INTO TRANSACTION VALUES(1,200,'WITHDRAWL',CURDATE())



DELIMITER //
Create Trigger before_UPDATE_PRODUCTS   
BEFORE INSERT ON SALES FOR EACH ROW  
BEGIN  
UPDATE PRODUCTS SET QUANTITY_ON_HAND=QUANTITY_ON_HAND-NEW.QUANTITY
WHERE PRODUCTID=NEW.PRODUCTID ;    
END//

