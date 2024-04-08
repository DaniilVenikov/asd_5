public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        //System.out.println(queue.dequeue());
//        int size = queue.size();
//        for (int i = 0; i < size; i++) {
//            System.out.print(queue.dequeue());
//        }

        System.out.println();

        Queue<Integer> test = AdvancedFeatures.rotation(queue, 2);
        int sizeTest = test.size();
        for (int i = 0; i < sizeTest; i++) {
            System.out.print(test.dequeue());
        }
    }
}
