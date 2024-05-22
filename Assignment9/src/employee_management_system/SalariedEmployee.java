package employee_management_system;

public class SalariedEmployee extends Employee{
    private  int perday=1500,id;
    private  String name="";

    SalariedEmployee(String name,int id){
        this.id=id;
        this.name=name;
    }

    @Override
    public void employeeSalary(int working_day) {
        System.out.println("Total salary"+perday*working_day);

    }

    @Override
    public void employeeInformation() {
        System.out.println("Name:"+name+"id"+id);;

    }
}
