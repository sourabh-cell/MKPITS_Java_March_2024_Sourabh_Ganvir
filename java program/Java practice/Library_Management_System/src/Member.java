public class Member {
    private int Member_id;
    private String name,Email_id,phone_no;

   Member(int Member_id,String phone_no,String name,String Email_id){
       this.Member_id=Member_id;
       this.phone_no=phone_no;
       this.name=name;
       this.Email_id=Email_id;
   }


    public int getMember_id() {
        return Member_id;
    }



    public String getPhone_no() {
        return phone_no;
    }



    public String getName() {
        return name;
    }



    public String getEmail_id() {
        return Email_id;
    }



    public void trackBooks()
    {


    }

    public void trackPayment()
    {

    }
}
