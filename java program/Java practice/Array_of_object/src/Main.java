import acc.Account;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
//       Student s[]=new Student[3];
//        for(int i=0;i<s.length;i++){
//            s[i] = new Student();
//        }
//       for(int i=0;i<s.length;i++){
//           s[i].acceptDetails();
//       }
//        for(int i=0;i<s.length;i++){
//            s[i].displayDetails();
//        }

//        Setterandgetter s = new Setterandgetter();
//        s.setName("sourabh");
//        s.setMark(85);
//        String n =s.getName();
//        System.out.println(n);
//        System.out.println(s.getMark());
//


//        Employee e=new Employee();
//        e.setId(1204);
//        e.setDept("Operation");
//        e.setName("Sourabh");
//        e.setSalary(100000);
//        e.setDesig("Manager");


        Account ac= new Account();
        Account ac1=new Account("Sourabh Ganvir","KKBK8021",98000);
        System.out.println(ac.getName());
        System.out.println(ac.getAcc_no());
        System.out.println(ac.getBalance());
        System.out.println(ac1.getName());
        System.out.println(ac1.getAcc_no());
        System.out.println(ac1.getBalance());

    }
}