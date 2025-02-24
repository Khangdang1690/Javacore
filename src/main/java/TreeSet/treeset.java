package TreeSet;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher(10));
        System.out.println(treeSet.lower(10));
        System.out.println(treeSet.ceiling(11));
        System.out.println(treeSet.floor(9));
        System.out.println(treeSet.subSet(10,20));
        System.out.println(treeSet.headSet(15));
        System.out.println(treeSet.tailSet(15));
        System.out.println("I'm tired");
        System.out.println("I push for company");
    }
}
