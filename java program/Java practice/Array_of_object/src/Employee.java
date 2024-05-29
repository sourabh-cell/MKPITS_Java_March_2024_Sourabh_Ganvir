public class Employee {
    private int id,salary;
    private String name,dept,desig;

    public void setName(String name)
    {
        this.name=name;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public void setSalary(int salary)
    {
        this.salary=salary;
    }

    public void setDept(String dept)
    {
        this.dept=dept;
    }

    public void setDesig(String desig)
    {
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
