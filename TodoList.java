public class TodoList {
    public static void main(String[] args) {

        Task task1 = new Task("買い物");
        Task task2 = new Task("掃除");

        task1.markAsDone();

        System.out.println(task1.getTask() + task1.getIsDone());
        System.out.println(task2.getTask() + task2.getIsDone());
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

