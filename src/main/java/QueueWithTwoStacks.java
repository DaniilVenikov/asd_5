import java.util.Stack;

public class QueueWithTwoStacks<T> {
    private final Stack<T> stackEnqueue;
    private final Stack<T> stackDequeue;

    public QueueWithTwoStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    public void enqueue(T item) {
        stackEnqueue.push(item);
    }

    public T dequeue() {
        if (isEmpty())
            return null;

        if (stackDequeue.isEmpty()) {
            int size = stackEnqueue.size();
            for (int i = 0; i < size; i++) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        return stackDequeue.pop();
    }

    public int size() {
        return stackEnqueue.size() + stackDequeue.size();
    }

    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }
}

