package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(10);
        pq.add(20);
        pq.add(15);
        System.out.println(pq.peek()); // smallest element
        System.out.println(pq);
        System.out.println(pq.poll()); // get and remove min

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.add(10);
        queue.add(15);
        queue.add(20);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
    }
}
