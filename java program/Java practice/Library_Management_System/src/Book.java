public class Book {
    private String Title,Author,bookid;
    private int price;

    public Book(String Title,String Author,int price,String book_id){
        this.Title=Title;
        this.Author=Author;
        this.price=price;
        this.bookid=book_id;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getBookid() {
        return bookid;
    }

    public int getPrice() {
        return price;
    }
}
