import static org.junit.Assert.*;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testEnqueue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.size());
    }

    @Test
    public void testDequeue() {
        Queue<String> queue = new Queue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        assertEquals("first", queue.dequeue());
        assertEquals("second", queue.dequeue());
        assertNull(queue.dequeue());
    }

    @Test
    public void testSize() {
        Queue<Double> queue = new Queue<>();
        assertEquals(0, queue.size());
        queue.enqueue(3.14);
        assertEquals(1, queue.size());
        queue.enqueue(2.71);
        assertEquals(2, queue.size());
    }
}

