package on_task_listeners;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
