public class Constructor {

    private int id,salary;
    private String name,dept,desig;


    public Constructor()
    {
        id=69;
        System.out.println("This is default constructor");
    }

    public Constructor(String name)
    {
        this.name=name;

    }

    public Constructor(int salary)
    {

        this.salary=salary;
    }

    public Constructor(String dept,String desig)
    {

        this.dept=dept;
        this.desig=desig;
    }

    public int getId() {
        return id;
    }

    public String getDesig() {
        return desig;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
