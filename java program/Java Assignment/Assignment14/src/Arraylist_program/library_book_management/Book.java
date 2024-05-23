package Arraylist_program.library_book_management;

public class Book {
   private int BookID;
   private String name;
   private int quantity;
   private int year;

    public Book(int productID, String name, int quantity, int price) {
        this.BookID = productID;
        this.name = name;
        this.quantity = quantity;
        this.year = price;
    }

    public int getBookID() {
        return BookID;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookID=" + BookID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", year=" + year +
                '}';
    }
}
