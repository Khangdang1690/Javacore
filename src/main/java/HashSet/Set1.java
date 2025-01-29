package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Hashtable<Integer, String> hash = new Hashtable<>();

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");

        for (String s: hashSet) {
            System.out.println(s);
        }

        System.out.println("===============");
        if(hashSet.contains("A")) {
            System.out.println("A");
        }

        System.out.println("===============");
        hashSet.remove("A");

        for (String s: hashSet) {
            System.out.println(s);
        }

        System.out.println("===============");
        if(hashSet.size() > 0) {
            System.out.println(hashSet.size());
        } else {
            System.out.println(hashSet.isEmpty());
        }

//        System.out.println("===============");
//        hashSet.clear();
//        if(hashSet.size() > 0) {
//            System.out.println(hashSet.size());
//        } else {
//            System.out.println(hashSet.isEmpty());
//        }

        System.out.println(Arrays.toString(hashSet.toArray()));
    }
}
