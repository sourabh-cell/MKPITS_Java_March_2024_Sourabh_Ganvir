package hourly_payment_employees;

public abstract class Employee {
    String name;
    int hourly_pay=100;

    Employee(String name,int hourly_pay){
        this.name=name;
        this.hourly_pay=hourly_pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourly_pay() {
        return hourly_pay;
    }

    public void setHourly_pay(int hourly_pay) {
        this.hourly_pay = hourly_pay;
    }

    public abstract int calculateSalary();
    }


