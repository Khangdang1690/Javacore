package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (String s: list) {
            System.out.println(s);
        }

        list.add(0,"AA");
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("=======Remove========");
        list.remove(2);
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("======Get/SET======");
        String s1 = list.get(3);
        System.out.println(s1);

        list.set(3, "DDD");
        for(String s: list) {
            System.out.println(s);
        }

        System.out.println("======Size======");
        if (list.isEmpty()) {
            System.out.println("Not empty");
        }

        list.clear();
        System.out.println("======After clear======");
        if (list.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(list);
        }

        System.out.println("======AfterAddAllList======");
        List<String> list1 = new ArrayList<>();
        list1.add("A1");
        list1.add("B1");
        list1.add("C1");
        list1.add("D1");

        list.addAll(list1);

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("A1=" + list.indexOf("A1"));

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("A");
        list2.add("C");
        list2.add("D");

        list2.sort(String::compareTo);

        System.out.println(list2);

        List<String> list3 = list2.subList(2, 4);
        System.out.println(list3);
    }
}
