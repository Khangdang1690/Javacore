package ArrayDeque;

import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addLast("D");
        deque.addLast("E");

        System.out.println(deque);

        deque.addFirst("001");

        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.peekFirst());

        System.out.println(deque.pollLast());
        deque.push("TestPush");
        System.out.println(deque);

        deque.pop();

        System.out.println(deque);
    }
}
