

public class Staff{
    private int staff_id;
    private String name,Login_id,password;


   public Staff(int staff_id,String name,String Login_id,String password){
       this.staff_id=staff_id;
       this.name=name;
       this.Login_id=Login_id;
       this.password=password;
   }


    public int getStaff_id() {
        return staff_id;
    }



    public String getName() {
        return name;
    }



    public String getLogin_id() {
        return Login_id;
    }

    public String getPassword() {
        return password;
    }

    public void bookIssued(){

    }
    public void addNewbook(String New_book_name,String Author,String bookid,int price)
    {

    }
    public void removeBook(String name){


    }

}
