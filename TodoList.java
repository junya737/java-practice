import java.util.ArrayList;
import java.util.List;


public class TodoList {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<Task>();
        Task task1 = new Task("買い物");
        Task task2 = new Task("掃除");
        task1.markAsDone();

        tasks.add(task1);
        tasks.add(task2);

        for (Task task : tasks){
            print(task.getTask()+ " : " + task.getIsDone());
        }
        
    }
}



class Task{
    private String task;
    private boolean isDone;

    // Constructor
    public  Task(String task){
        this.task = task;
        this.isDone = false;
    }
    public String getTask(){
        return this.task;
    }
    public boolean getIsDone(){
        return this.isDone;
    }

    public void markAsDone(){
        this.isDone = true;
    }

    public void markAsNotDone(){
        this.isDone = false;
    }

}

