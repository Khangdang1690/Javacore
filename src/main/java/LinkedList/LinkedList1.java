package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.addFirst("AA");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        list.addFirst("CCC");
        list.addLast("DDD");
        list.add(1, "9999"); // insert in the middle of a linkedlist
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
