package Tasks;

import java.util.Arrays;
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



        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }

        }

        System.out.println(map);


    }


}

