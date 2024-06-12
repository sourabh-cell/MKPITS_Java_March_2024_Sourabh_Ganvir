##CREATING DATABASE FOR SHOP MANAGEMENT SYSTEM
# Create the database
CREATE DATABASE shop_management;

# Use the database
USE shop_management;

#Create the Products table
CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100) NOT NULL,
    Price int NOT NULL,
    SupplierID INT
    )
    
 INSERT INTO Products (ProductID, ProductName, Price, SupplierID)
VALUES (105, 'Air Condition',60000 , 102);




# Create the Customers table
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    FirstName CHAR(10) NOT NULL,
    LastName VARCHAR(10) NOT NULL,
    Phone CHAR(12),
    Address TEXT
);

INSERT INTO customers (CustomerId, FirstName, LastName, Phone, Address)
VALUES 
(1, 'Sourabh','Ganvir',9112341222,'Nagpur'),
(2, 'Nikhil','Gawande', 9579642580, 'Wardha'),
(3, 'Akshay','Goyal', 7845587580, 'Amravati'),
(4, 'Vilas','Turak', 6523642580, 'yavatmal'),
(5, 'Sanket','Thawkar', 8895642580, 'Surat');


## Create the Inventory table
CREATE TABLE Inventory (
    InventoryID INT AUTO_INCREMENT PRIMARY KEY,
    ProductID INT,
    Quantity INT NOT NULL
    
);

INSERT INTO Inventory (ProductID, Quantity)
VALUES 
(101, 50),
(102, 75),
(103, 20),
(104, 100),
(105, 10);

-- Create the Suppliers table
CREATE TABLE Suppliers (
    SupplierID INT AUTO_INCREMENT PRIMARY KEY,
    SupplierName CHAR(10) NOT NULL,
    ContactName CHAR(10),
    ContactPhone VARCHAR(15),
    Address TEXT
);

INSERT INTO Suppliers (SupplierName, ContactName, ContactPhone, Address)
VALUES 
('Reliance', 'Mukesh', '919876543210', 'Reliance Industries Limited, Mumbai, Maharashtra'),
('Tata', 'Ratan', '919812345678', 'Bombay House, Mumbai, Maharashtra'),
('Infosys', 'Nandan', '919876512345', 'Electronics City, Bangalore, Karnataka'),
('Wipro', 'Azim', '919876523456', 'Sarjapur Road, Bangalore, Karnataka'),
('HDFC', 'Deepak', '919876534567', 'HDFC House, Mumbai, Maharashtra');

CREATE TABLE Purchases (
    PurchaseID INT AUTO_INCREMENT PRIMARY KEY,
    ProductID INT,
    SupplierID INT,
    Quantity INT NOT NULL,
    PurchaseDate DATE,
    PurchasePrice DECIMAL(10, 2)
);

INSERT INTO Purchases (ProductID, SupplierID, Quantity, PurchaseDate, PurchasePrice)
VALUES 
(101, 1, 50, '2024-01-10', 100.00),
(102, 2, 75, '2024-02-15', 150.00),
(103, 3, 20, '2024-03-20', 50.00),
(104, 4, 100, '2024-04-25', 200.00),
(105, 5, 10, '2024-05-30', 25.00);

-- Create Sales table
CREATE TABLE Sales (
    SaleID INT AUTO_INCREMENT PRIMARY KEY,
    ProductID INT,
    Quantity INT NOT NULL,
    SaleDate DATE,
    SalePrice int
);

INSERT INTO Sales (ProductID, Quantity, SaleDate, SalePrice)
VALUES 
(101, 10, '2024-06-01', 120.00),
(102, 20, '2024-06-05', 180.00),
(103, 5, '2024-06-10', 60.00),
(104, 50, '2024-06-15', 220.00),
(105, 8, '2024-06-20', 30.00);

