import on_task_listeners.OnTaskDoneListener;
import on_task_listeners.OnTaskErrorListener;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerError = System.out::println;

        Worker worker = new Worker(listener, listenerError);
        worker.doTasks();
    }
}