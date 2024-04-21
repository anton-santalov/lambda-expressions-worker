package on_task_listeners;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
