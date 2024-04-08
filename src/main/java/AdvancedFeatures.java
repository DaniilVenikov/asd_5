public class AdvancedFeatures {

    public static <T> Queue<T> rotation(Queue<T> queue, int numberElement) {
        for (int i = 0; i < numberElement; i++) {
            T element = queue.dequeue();
            queue.enqueue(element);
        }
        return queue;
    }
}
