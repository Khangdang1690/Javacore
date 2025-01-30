package HashMap;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the HashMap
        map.put("Orange", 1);
        map.put("Tangerine", 2);
        map.put("Jackfruit", 3);
        map.put(null, 4); // Add a null key
        map.put("Coconut", null); // Add a null value

        // Retrieve a value from the HashMap
        System.out.println("Value of key 'Tangerine': " + map.get("Tangerine")); // Prints 2

        // Check if the HashMap contains a specific key or value
        System.out.println("Does it contain the key 'Jackfruit'? " + map.containsKey("Jackfruit")); // Prints true
        System.out.println("Does it contain the value 4? " + map.containsValue(4)); // Prints true

        // Iterate through the elements of the HashMap
        System.out.println("Elements in the HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
