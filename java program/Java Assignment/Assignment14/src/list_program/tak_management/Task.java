package list_program.tak_management;

public class Task {
    int task_id;
    String task_name;
    int priority;
    String due_date;



    public Task(String task_name, int task_id, int priority, String due_date) {  //Parameterized Constructor
        this.task_name = task_name;
        this.task_id = task_id;
        this.priority = priority;
        this.due_date = due_date;
    }

    public int getTask_id() {
        return task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public int getPriority() {
        return priority;
    }

    public String getDue_date() {
        return due_date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", task_name='" + task_name + '\'' +
                ", priority=" + priority +
                ", due_date='" + due_date + '\'' +
                '}';
    }
}
