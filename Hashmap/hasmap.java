package Hashmap;
import java.util.*;

public class hasmap {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 1. INSERT values (put)
        map.put("Apple", 100);
        map.put("Mango", 120);
        map.put("Banana", 60);

        // 2. UPDATE value (put on same key replaces old value)
        map.put("Apple", 150); // updates Apple price

        // 3. GET value by key
        System.out.println("Price of Mango = " + map.get("Mango"));

        // 4. REMOVE a key
        map.remove("Banana");

        // 5. CHECK if a key exists
        System.out.println("Contains 'Apple'? " + map.containsKey("Apple"));

        // 6. CHECK if a value exists
        System.out.println("Contains value 150? " + map.containsValue(150));

        // 7. SIZE of map
        System.out.println("Size = " + map.size());

        // 8. Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // clear the hashmap
        // map.clear();
        // System.out.println("Is map empty? " + map.isEmpty());

        // Iteration
        Set<String> keys=map.keySet();
        System.out.println(keys);
        System.out.println(keys);

        for (String key : keys) { 
            System.out.println("key = "+key+" , "+"value = "+map.get(key));
        }
    }
}
