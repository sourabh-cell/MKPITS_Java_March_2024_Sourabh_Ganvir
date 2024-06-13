package menudrivendatabaseoperation.pojoclassstudent;

public class Student {
    private String roll;

    private String name;

    private String city;

    private String Address;

    public Student(String roll, String name, String city, String address) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        Address = address;
    }

    public String getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return Address;
    }
}
