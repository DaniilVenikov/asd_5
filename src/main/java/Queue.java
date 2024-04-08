import java.util.*;

public class Queue<T>
{
    private final List<T> list;

    public Queue()
    {
        list = new ArrayList<>();
    }

    public void enqueue(T item)
    {
        list.add(item);
    }

    public T dequeue()
    {
        return list.isEmpty() ? null : list.remove(0);
    }

    public int size()
    {
        return list.size();
    }

}
