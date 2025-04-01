package collections.maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Graz", 306068);
        map.put("Vienna", 2005500);
        map.put("Linz", 212538);
        map.put("New York", 19007100);
        map.put("London", 8866180);
        map.put("Beijing", 22000000);

        // find values via key
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " has a population of " + value);
        }

        // find all values
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // loop over key-value pairs
        for (HashMap.Entry<String, Integer> entries : map.entrySet()) {
            System.out.println(entries.getKey() + " has a population of " + entries.getValue());
        }

        // remove item in map
        map.remove("London");

        // find all that fulfill a condition
        for (Integer value : map.values()) {
            if (value >= 1000000) {
                System.out.println(value);
            }
        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("These cities have a population of over 1000000:");
            if (value >= 1000000) {
                System.out.println(key);
            }
        }

        for (HashMap.Entry<String, Integer> entries : map.entrySet()) {
            System.out.println("These cities have a population of over 1000000:");
            if (entries.getValue() >= 1000000) {
                System.out.println(entries.getKey());
            }
        }

        // change value in map
        map.replace("Graz", 306068, 306075);

    }
}
