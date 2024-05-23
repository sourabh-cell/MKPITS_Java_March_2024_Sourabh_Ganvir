package list_program.tak_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskMangement taskmanagement=new TaskMangement();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Sort And Display\n4.exit\n5.Search By Record");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    taskmanagement.addTask();
                    break;

                case 2:
                    taskmanagement.displaytask();
                    break;

                case 3:
                    taskmanagement.sortTask();
                    break;

                case 4:
                    System.exit(0);
                    break;

                case 5:
                    taskmanagement.searchById();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }
    }
}
