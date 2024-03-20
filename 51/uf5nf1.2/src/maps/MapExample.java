package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ProvenSoft
 */
public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        //put data
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        items.put("A", 10);  //10: int -> autoboxing
        items.put("B", 20);
        items.put("C", 30);
        //
        System.out.println("items: "+items);
        //
        System.out.println("Iterate map with for-each over keys");
        Set<String> keys = items.keySet();
        for (String key : keys) {
            System.out.printf("%s: %d%n", key, items.get(key));
        }
        //
        System.out.println("Iterate map with for-each over Map.Entry");
        Set<Map.Entry<String, Integer>> entries = items.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("%s: %d%n", key, value);
        }
        //
        System.out.println("Iterate map with an iterator over Map.Entry");
        Iterator<Map.Entry<String, Integer>> iter = entries.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("%s: %d%n", key, value);
        }
        //
        items.replace("D", 110);
        System.out.println("items: "+items);
        //
        items.remove("D");
        System.out.println("items: "+items);
        //
        System.out.println("keys: "+items.keySet());
        System.out.println("values: "+items.values());
        //
        System.out.println("items.containsKey('E'): "+ items.containsKey("E"));
        System.out.println("items.containsValue(50): "+ items.containsValue(50));
    }
    
}
