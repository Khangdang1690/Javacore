package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        // Create a LinkedHashMap with insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add elements to the LinkedHashMap
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);

        // Iterate through the elements of the LinkedHashMap
        System.out.println("LinkedHashMap (in insertion order): " + linkedHashMap);

        // Access elements to check the order
        linkedHashMap.get("Two");
        linkedHashMap.get("Three");

        // Iterate through the elements of the LinkedHashMap after access
        System.out.println("LinkedHashMap after access (order unchanged): " + linkedHashMap);
    }
}
