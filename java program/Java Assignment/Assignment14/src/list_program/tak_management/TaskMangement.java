package list_program.tak_management;
import java.util.*;

public class TaskMangement {

   private LinkedList<Task> taskList;
   Scanner scanner=new Scanner(System.in);

    public TaskMangement() {
        taskList = new LinkedList<Task>();
    }

    public void addTask()
    {
        System.out.println("Please Enter the Task id");
        int task_id =scanner.nextInt();
        System.out.println("Please Enter the Task Name");
        String task_name=scanner.next();
        System.out.println("Please Enter the Task Priority");
        int task_priority= scanner.nextInt();
        System.out.println("Please Enter the Task Due Date");
        String due_date= scanner.next();
        Task task=new Task(task_name,task_id,task_priority,due_date);
        taskList.add(task);
        System.out.println("Task added Successfull");

    }

    public void searchById(){
        System.out.println("Enter the Task Id");
        int id= scanner.nextInt();
        for (Task t:taskList)
        {
            if (id == t.getTask_id()) {
                System.out.println("Record Found :-"+"Name :-"+t);
            }
        }
    }

    public void sortTask()
    {
        Collections.sort(taskList, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getDue_date().compareTo(t2.due_date);
            }
        });
        displaytask();
    }

    public void displaytask()
    {
        Iterator iterator = taskList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
