import on_task_listeners.OnTaskDoneListener;
import on_task_listeners.OnTaskErrorListener;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener callbackError;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callbackError) {
        this.callback = callback;
        this.callbackError = callbackError;
    }

    public void doTasks() {
        for (int i = 1; i <= 100; i++) {
            if (i == 33) {
                callbackError.onError("Task " + i + " failed.");
            } else {
                callback.onDone("Task " + i + " is done.");
            }
        }
    }
}
