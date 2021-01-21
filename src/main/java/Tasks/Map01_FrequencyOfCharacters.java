package Tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/*
Write a method that prints the frequency of each character from a String
 */
public class Map01_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "picture perfect";
        System.out.println(str);

        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);

        char[] charArr = str2.toCharArray();
        System.out.println(charArr);


        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : charArr) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }

        }

        System.out.println(map);


        System.out.println("=========================");

        Map<Integer, String> map2 = new LinkedHashMap<>();

        // Mapping string values to int keys
        map2.put(10, "Geeks");
        map2.put(15, "4");
        map2.put(20, "Geeks");
        map2.put(25, "Welcomes");
        map2.put(30, "You");

        // Displaying the Map
        System.out.println("Initial Mappings are: " + map2);

        // Getting the value of 25
        System.out.println("The Value of 25 is: " + map2.get(25));

        // Getting the value of 10
        System.out.println("The Value of 10 is: " + map2.get(10));



        System.out.println("--------------------");


        Map<Integer, Integer> map3 = new LinkedHashMap<>();

        // Mapping string values to int keys
        map3.put(10, 1);
        map3.put(15, 2);
        map3.put(20, 3);
        map3.put(25, 4);
        map3.put(30, 5);

        // Displaying the Map
        System.out.println("Initial Mappings are: " + map3);

        System.out.println(map3.get(10));
        System.out.println(map3.get(20));


    }


}

