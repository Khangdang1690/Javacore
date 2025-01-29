package LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

    public static void main(String[] args) {
        // Khởi tạo LinkedHashSet
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();

        // Thêm phần tử vào LinkedHashSet
        linkedHashSet.add("Cam");
        linkedHashSet.add("Quýt");
        linkedHashSet.add("Mít");
        linkedHashSet.add("Dừa");
        linkedHashSet.add(null);

        // LinkedHashSet duy trì thứ tự chèn
        System.out.println(linkedHashSet); // [Cam, Quýt, Mít, Dừa]
        System.out.println("==================");

        HashSet hashSet = new HashSet<>();

        hashSet.add("Cam");
        hashSet.add("Quýt");
        hashSet.add("Mít");
        hashSet.add("Dừa");

        System.out.println(hashSet);
        System.out.println("==================");

        if (linkedHashSet.contains(null)) {
            System.out.println("is Null");
        }

        System.out.println("==================");

        Set<String> set = new HashSet<>(hashSet);
        set.retainAll(linkedHashSet);
        System.out.println(set);
    }
}
