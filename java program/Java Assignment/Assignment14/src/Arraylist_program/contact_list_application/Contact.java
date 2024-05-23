//Create a contact list application where users can add, remove, and search for contacts.
// Each contact should have properties such as contactID, name, phoneNumber, and email.
// Implement functionality to display all contacts, search for a contact by name,
// and update a contact's phone number and email.
package Arraylist_program.contact_list_application;

public class Contact {
    private int contactID;
    private String name;
    private  String phoneNumber;
    private String email;


    public Contact(int contactID, String name, String phoneNumber, String email) {
        this.contactID = contactID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactID=" + contactID +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
