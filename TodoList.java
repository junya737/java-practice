
import java.util.ArrayList;
import java.util.List;


public class TodoList {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<Task>();
        Task task1 = new SimpleTask("買い物");
        Task task2 = new SimpleTask("掃除");
        task1.markAsDone();

        tasks.add(task1);
        tasks.add(task2);

        for (Task task : tasks){
            Util.print(task.getDetails());
        }
    }
}

// Util class
class Util{
    public static void print(String message){
        System.out.println(message);
    }
}


abstract class Task{
    private String title;
    private boolean isDone;

    // Constructor
    public  Task(String title){
        this.title = title;
        this.isDone = false;
    }
    public String getTitle(){
        return this.title;
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
    
    public abstract String getDetails();
}

// simple task
class SimpleTask extends Task{

    // Constructor
    public SimpleTask(String title){
        super(title);
    }
    
    @Override
    public String getDetails(){
        return getTitle() + " : " + getIsDone();
    }


}