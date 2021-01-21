package Tasks;


import java.util.*;

/*
Write a method that can return the minimum value from a map (DO NOT use sort method)
 */
public class Map02_MinValue_MaxValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        // Mapping string values to int keys
        map.put("B", 20);
        map.put("C", 50);
        map.put("A", 10);
        map.put("D", 40);
        map.put("E", 30);

        System.out.println(map);

        SortedSet<Integer> mapSet = new TreeSet<>(map.values());
        System.out.println(mapSet);

        System.out.println(mapSet.first());

        System.out.println(mapSet.last());


        System.out.println("=======================");
        List<Integer> mapByValue = new ArrayList<>(map.values());
        Collections.sort(mapByValue);
        System.out.println(mapByValue);
        System.out.println(mapByValue.get(0));

    }
}
