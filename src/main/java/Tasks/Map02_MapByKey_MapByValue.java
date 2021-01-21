package Tasks;

import java.util.*;
/*
getting the keys and values separately from a map
 */

public class Map02_MapByKey_MapByValue {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

        // Mapping string values to int keys
        map.put(10, "Geeks");
        map.put(15, "4");
        map.put(30, "You");
        map.put(20, "Geeks");
        map.put(25, "Welcomes");


        System.out.println(map);

        List<Integer> mapByKey = new ArrayList<Integer>(map.keySet());
        Collections.sort(mapByKey);
        System.out.println(mapByKey);

        List<String> mapByValue = new ArrayList<>(map.values());
        Collections.sort(mapByValue);
        System.out.println(mapByValue);

    }
}
