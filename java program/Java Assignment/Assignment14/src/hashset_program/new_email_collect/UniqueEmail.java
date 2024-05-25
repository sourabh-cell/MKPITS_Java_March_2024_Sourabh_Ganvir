package hashset_program.new_email_collect;

public class UniqueEmail {
     private String email_addreass;

    public UniqueEmail(String email_addreass)
    {
        this.email_addreass = email_addreass;
    }



    public String getEmail_addreass()
    {
        return email_addreass;
    }

    public void setEmail_addreass(String email_addreass)
    {
        this.email_addreass = email_addreass;
    }

    @Override
    public String toString() {
        return "UniqueEmail{" +
                "email_addreass=" + email_addreass +
                '}';
    }
}
