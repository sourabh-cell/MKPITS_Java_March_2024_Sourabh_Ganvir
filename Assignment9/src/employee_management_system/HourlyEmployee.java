package employee_management_system;

public class HourlyEmployee extends Employee{
    private int perday=1000,id;
    private String name="";
    HourlyEmployee(String name, int id){
        this.id=id;
        this.name=name;
    }
    @Override
    public void employeeSalary(int workin_days) {
        System.out.println(perday*workin_days);

    }

    @Override
    public void employeeInformation() {
        System.out.println("Name:"+name+"id"+id);
    }
}
